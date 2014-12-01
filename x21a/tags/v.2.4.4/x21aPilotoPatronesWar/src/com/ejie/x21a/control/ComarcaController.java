package com.ejie.x21a.control;


import com.ejie.x21a.service.ComarcaService;
import com.ejie.x38.dto.JQGridJSONModel;
import com.ejie.x38.dto.Pagination;
import com.ejie.x38.util.ObjectConversionManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.ejie.x21a.model.Comarca;

/**
 * ComarcaController generated by UDA, 14-ago-2012 12:59:41.
 * @author UDA
 */
 
@Controller
@RequestMapping (value = "/comarca")

public class ComarcaController  {

	private static final Logger logger = LoggerFactory.getLogger(ComarcaController.class);

	@Autowired
	private ComarcaService comarcaService;
	
	/**
	 * Method 'getCreateForm'.
	 *
	 * @param model Model
	 * @return String
	 */
	@RequestMapping(value = "maint", method = RequestMethod.GET)
	public String getCreateForm(Model model) {
		ComarcaController.logger.info("[GET - View] : comarca");
		return "comarca";
	}

	/**
	 * Method 'getById'.
	 *
	 * @param code BigDecimal
	 * @return comarca Comarca
	 */
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody Comarca getById(@PathVariable BigDecimal code) {
        Comarca comarca = new Comarca();
		comarca.setCode(code);
        comarca = this.comarcaService.find(comarca);
        ComarcaController.logger.info("[GET - findBy_PK] : Obtener Comarca por PK");
        return comarca;
	}

	/**
	 * Method 'getAll'.
	 *
	 * @param filterComarca Comarca
	 * @return List
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Comarca> getAll(@ModelAttribute Comarca filterComarca) {
		ComarcaController.logger.info("[GET - find_ALL] : Obtener Comarca por filtro");
	    return this.comarcaService.findAll(filterComarca, null);
	}

	/**
	 * Method 'edit'.
	 *
	 * @param comarca Comarca 
	 * @return Comarca
	 */
	@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Comarca edit(@RequestBody Comarca comarca) {		
        Comarca comarcaAux = this.comarcaService.update(comarca);
		ComarcaController.logger.info("[PUT] : Comarca actualizado correctamente");
        return comarcaAux;
    }

	/**
	 * Method 'add'.
	 *
	 * @param comarca Comarca 
	 * @return Comarca
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Comarca add(@RequestBody Comarca comarca) {		
        Comarca comarcaAux = this.comarcaService.add(comarca);
        ComarcaController.logger.info("[POST] : Comarca insertado correctamente");
    	return comarcaAux;
	}

	/**
	 * Method 'remove'.
	 *
	 * @param code BigDecimal
	 * @return comarca
	 */
	@RequestMapping(value = "/{code}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Comarca remove(@PathVariable BigDecimal code) {
        Comarca comarca = new Comarca();
        comarca.setCode(code);
        this.comarcaService.remove(comarca);
       	ComarcaController.logger.info("[DELETE] : Comarca borrado correctamente");
       	return comarca;
    }
	
	/**
	 * Method 'removeAll'.
	 *
	 * @param comarcaIds List
	 * @return comarcaList
	 */	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<List<String>> removeMultiple(@RequestBody List<List<String>> comarcaIds) {
        List<Comarca> comarcaList = new ArrayList<Comarca>();
        for (List<String> comarcaId:comarcaIds) {
		    Iterator<String> iterator = comarcaId.iterator();
		    Comarca comarca = new Comarca(); //NOPMD - Objeto nuevo en la lista (parametro del servicio)
	        comarca.setCode(ObjectConversionManager.convert(iterator.next(), java.math.BigDecimal.class));
		    comarcaList.add(comarca);
	    }
        this.comarcaService.removeMultiple(comarcaList);
		ComarcaController.logger.info("[POST - DELETE_ALL] : Comarca borrados correctamente");
		return comarcaIds;
	}	

	/**
	 * Method 'getAllJQGrid'.
	 *
	 * @param filterComarca Comarca
	 * @param pagination Pagination
	 * @return JQGridJSONModel
	 */
	@RequestMapping(method = RequestMethod.GET, headers={"JQGridModel=true"})
	public @ResponseBody JQGridJSONModel getAllJQGrid(@ModelAttribute Comarca filterComarca, @ModelAttribute Pagination pagination) {
        List<Comarca> comarcas = this.comarcaService.findAll(filterComarca, pagination);
        Long recordNum = this.comarcaService.findAllCount(filterComarca);
        ComarcaController.logger.info("[GET - jqGrid] : Obtener Comarca");
		return new JQGridJSONModel(pagination, recordNum, comarcas);
	}
	
}	