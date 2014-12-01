/*
* Copyright 2012 E.J.I.E., S.A.
*
* Licencia con arreglo a la EUPL, Versión 1.1 exclusivamente (la «Licencia»);
* Solo podrá usarse esta obra si se respeta la Licencia.
* Puede obtenerse una copia de la Licencia en
*
* http://ec.europa.eu/idabc/eupl.html
*
* Salvo cuando lo exija la legislación aplicable o se acuerde por escrito,
* el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
* SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
* Véase la Licencia en el idioma concreto que rige los permisos y limitaciones
* que establece la Licencia.
*/
package com.ejie.x21a.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.ejie.x21a.model.Usuario;
import com.ejie.x21a.service.UsuarioService;
import com.ejie.x38.dto.JQGridJSONModel;
import com.ejie.x38.dto.Pagination;
import com.ejie.x38.reports.ReportData;
import com.ejie.x38.util.ObjectConversionManager;
/**
 * UsuarioServiceImpl generated by UDA 1.0, 26-may-2011 13:46:35.
* @author UDA
 */
@Controller
@RequestMapping (value = "/usuario")

public class UsuarioController  {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService usuarioService;
	
	//Selección simple
	@RequestMapping(value = "simple", method = RequestMethod.GET)
	public String getSimple(Model model) {
		return "simple";
	}
	//Multiselección
	@RequestMapping(value = "multi", method = RequestMethod.GET)
	public String getMulti(Model model) {
		return "multi";
	}
	
	//Llamadas ajax de mantenimientos
	@RequestMapping(value = "simpleTable1", method = RequestMethod.GET)
	public String getMaintSimple1(Model model) {
		return "simpleTable1";
	}
	@RequestMapping(value = "simpleTable2", method = RequestMethod.GET)
	public String getMaintSimple2(Model model) {
		return "simpleTable2";
	}
	@RequestMapping(value = "simpleTable3", method = RequestMethod.GET)
	public String getMaintSimple3(Model model) {
		return "simpleTable3";
	}
	@RequestMapping(value = "editTable1", method = RequestMethod.GET)
	public String getEditMaint1(Model model) {
		return "editMaint1";
	}
	@RequestMapping(value = "multiTable1", method = RequestMethod.GET)
	public String getMultiMaint1(Model model) {
		return "multiMaint1";
	}
	
	//Multiselección agrupada
	@RequestMapping(value = "groupMulti", method = RequestMethod.GET)
	public String getGroupMulti(Model model) {
		return "groupMulti";
	}
	//Edición en línea
	@RequestMapping(value = "edlinea", method = RequestMethod.GET)
	public String getCreateForm(Model model) {
		return "edlinea";
	}
	 /**
	 * Method 'getById'.
	 * @param  id String
	 * @return String
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Usuario getById(@PathVariable String id) {
        Usuario usuario = new Usuario();
		usuario.setId(id);
        usuario = this.usuarioService.find(usuario);
        
        /*
         * 
         */
        if (usuario.getEjie().equals("0")){
			usuario.setTipo("0A");
			usuario.setSubtipo("0_0A_A");
		}else if (usuario.getEjie().equals("1")){
			usuario.setTipo("1A");
			usuario.setSubtipo("1_1A_A");
		}
        
        /*
         * 
         */
        
        return usuario;
	}


	 /**
	 * Method 'getAll'.
	*@param	  id String
	*@param	  nombre String
	*@param	  apellido1 String
	*@param	  apellido2 String
	*@param	  ejie String
	*@param	  fechaAlta Date
	*@param	  fechaBaja Date
	*@param request HttpServletRequest
	 * @return String
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Object getAll(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "apellido1", required = false) String apellido1,
			@RequestParam(value = "apellido2", required = false) String apellido2,
			@RequestParam(value = "ejie", required = false) String ejie,
			@RequestParam(value = "fechaAlta", required = false) Date fechaAlta,
			@RequestParam(value = "fechaBaja", required = false) Date fechaBaja,
			@RequestParam(value = "multicombo", required = false) String multicombo,
			HttpServletRequest request) {
		Usuario filterUsuario = new Usuario(id, nombre, apellido1, apellido2, ejie, fechaAlta, fechaBaja);
        Pagination pagination = null;
	    if (request.getHeader("JQGridModel") != null &&  request.getHeader("JQGridModel").equals("true")) {
		    pagination = new Pagination();
		    pagination.setPage(Long.valueOf(request.getParameter("page")));
		    pagination.setRows(Long.valueOf(request.getParameter("rows")));
		    pagination.setSort(request.getParameter("sidx"));
		    pagination.setAscDsc(request.getParameter("sord"));
            List<Usuario> usuarios =  this.usuarioService.findAllLike(filterUsuario, pagination, false);

			Long total =  getAllCount(filterUsuario);
			        

		        /*
		         * 
		         */
		        
		        for (Iterator<Usuario> iterator = usuarios.iterator(); iterator
						.hasNext();) {
					Usuario usuario = (Usuario) iterator.next();
					
					if (usuario.getEjie().equals("0")){
						usuario.setTipo("0A");
						usuario.setSubtipo("0_0A_A");
					}else if (usuario.getEjie().equals("1")){
						usuario.setTipo("1A");
						usuario.setSubtipo("1_1A_A");
					}
					
				}
		        
		        /*
		         * 
		         */
			        
			        
	        JQGridJSONModel data = new JQGridJSONModel();
		    data.setPage(request.getParameter("page"));
		    data.setRecords(total.intValue());
		    data.setTotal(total, pagination.getRows());
		    data.setRows(usuarios);
		    return data;
		}else{
		    return this.usuarioService.findAllLike(filterUsuario, pagination, false);
		}
	}

	/**
	 * Method 'getAllCount'.
	 * @param filterUsuario Usuario 
	 * @return Long
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public @ResponseBody Long getAllCount(@RequestParam(value = "usuario", required = false) Usuario  filterUsuario) {
		return usuarioService.findAllLikeCount(filterUsuario != null ? filterUsuario: new Usuario (),false);
	}
	
	 /**
	 * Method 'edit'.
	 * @param usuario Usuario 
	 * @return Usuario
	 */
	@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Usuario edit(@Validated @RequestBody Usuario usuario) {		
        Usuario usuarioAux = this.usuarioService.update(usuario);
		logger.info("Entity correctly updated!");
        return usuarioAux;
    }

	 /**
	 * Method 'add'.
	 * @param usuario Usuario 
	 * @return Usuario
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Usuario add(@Validated @RequestBody Usuario usuario) {		
        Usuario usuarioAux = this.usuarioService.add(usuario);
        logger.info("Entity correctly inserted!");
    	return usuarioAux;
	}

	 /**
	 * Method 'remove'.
	 * @param id String
	 *
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
    public @ResponseBody Usuario remove(@PathVariable(value="id") String id, HttpServletResponse  response) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        this.usuarioService.remove(usuario);
        logger.info("Entity correctly deleted!");
        return usuario;
    }
	
	 /**
	 * Method 'removeAll'.
	 * @param  usuarioIds  ArrayList
	 *
	 */	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody List<List<String>> removeMultiple(@RequestBody List<List<String>> usuarioIds) {
		List<Usuario> usuarioList = new ArrayList<Usuario>();
        for (List<String> usuarioId:usuarioIds) {
		    Iterator<String> iterator = usuarioId.iterator();
			    Usuario usuario = new Usuario();
		        usuario.setId(ObjectConversionManager.convert(iterator.next(), String.class));
			    usuarioList.add(usuario);
	    }
        this.usuarioService.removeMultiple(usuarioList);
        logger.info("All entities correctly deleted!");
        return usuarioIds;
	}
	
	/**
	 * EXPORTERS
	 */
	@RequestMapping(value = "csvReport", method = RequestMethod.POST)
	protected ModelAndView getCSVReport(@ModelAttribute Usuario filterUsuario, @ModelAttribute Pagination pagination,
			ModelMap modelMap,
			@RequestParam(value = "columns", required = false) String columns){
		
		//Acceso a BD para recuperar datos
		pagination.setPage(null);
		pagination.setRows(null);
		List<Usuario> listUsuarioAll = this.usuarioService.findAllLike(filterUsuario, pagination, false);
		
		//Nombre fichero
		modelMap.put("fileName", "datosCSV");
			
		//Datos
		ReportData<Usuario> reportData = new ReportData<Usuario>();
			//cabeceras hoja
			reportData.setHeaderNames(ReportData.parseColumns(columns));
			//datos hoja
			reportData.setModelData(listUsuarioAll);
		modelMap.put("reportData", reportData);
		
		//Generación del CVS
		return new ModelAndView("csvReport", modelMap);
	}
	
	
	@RequestMapping(value = {"xlsReport" , "xlsxReport"}, method = RequestMethod.POST)
	protected ModelAndView getExcelPOI(@ModelAttribute Usuario filterUsuario, @ModelAttribute Pagination pagination,
			ModelMap modelMap,
			@RequestParam(value = "columns", required = false) String columns,
			HttpServletRequest request){
		
		//Acceso a BD para recuperar datos
		List<Usuario> listUsuarioPage = this.usuarioService.findAllLike(filterUsuario, pagination, false);
		pagination.setPage(null);
		pagination.setRows(null);
		List<Usuario> listUsuarioAll = this.usuarioService.findAllLike(filterUsuario, pagination, false);
		
		//Nombre fichero
		modelMap.put("fileName", "datosExcel");
		
		//Datos
		List<Object> reportData = new ArrayList<Object>();
			//Hoja 1
			ReportData<Usuario> usuarioExcelDataAll = new ReportData<Usuario>();
				//nombre hoja
				usuarioExcelDataAll.setSheetName("Todos los usuarios");
				//cabeceras hoja
				usuarioExcelDataAll.setHeaderNames(ReportData.parseColumns(columns));
				//datos hoja
				usuarioExcelDataAll.setModelData(listUsuarioAll);
			reportData.add(usuarioExcelDataAll);
			//Hoja 2
			ReportData<Usuario> usuarioExcelDataPage = new ReportData<Usuario>();
				//nombre hoja
				usuarioExcelDataPage.setSheetName("Página 1 de usuarios");
				//cabeceras hoja
				usuarioExcelDataPage.setHeaderNames(ReportData.parseColumns(columns));
				//datos hoja
				usuarioExcelDataPage.setModelData(listUsuarioPage);
			reportData.add(usuarioExcelDataPage);
		modelMap.put("reportData", reportData);
		
		//Generación del XLS o XLSX
		String reportView = request.getServletPath().substring(9);
		return new ModelAndView(reportView, modelMap);
		
//			return new ModelAndView("xlsReport", modelMap);
//			return new ModelAndView("xlsxReport", modelMap);
	}
	
	
	@RequestMapping(value = "odsReport", method = RequestMethod.POST)
	protected ModelAndView getODSReport(@ModelAttribute Usuario filterUsuario, @ModelAttribute Pagination pagination,
			ModelMap modelMap,
			@RequestParam(value = "columns", required = false) String columns){
		
		//Acceso a BD para recuperar datos
		List<Usuario> listUsuarioPage = this.usuarioService.findAllLike(filterUsuario, pagination, false);
		pagination.setPage(null);
		pagination.setRows(null);
		List<Usuario> listUsuarioAll = this.usuarioService.findAllLike(filterUsuario, pagination, false);
		
		//Nombre fichero
		modelMap.put("fileName", "datosODS");
		
		//Datos
		List<Object> reportData = new ArrayList<Object>();
			//Hoja 1
			ReportData<Usuario> usuarioExcelDataAll = new ReportData<Usuario>();
				//nombre hoja
				usuarioExcelDataAll.setSheetName("Todos los usuarios");
				//cabeceras hoja
				usuarioExcelDataAll.setHeaderNames(ReportData.parseColumns(columns));
				//datos hoja
				usuarioExcelDataAll.setModelData(listUsuarioAll);
			reportData.add(usuarioExcelDataAll);
			//Hoja 2
			ReportData<Usuario> usuarioExcelDataPage = new ReportData<Usuario>();
				//nombre hoja
				usuarioExcelDataPage.setSheetName("Página 1 de usuarios");
				//cabeceras hoja
				usuarioExcelDataPage.setHeaderNames(ReportData.parseColumns(columns));
				//datos hoja
				usuarioExcelDataPage.setModelData(listUsuarioPage);
			reportData.add(usuarioExcelDataPage);
		modelMap.put("reportData", reportData);
		
		//Generación del ODS
		return new ModelAndView("odsReport", modelMap);
	}
	
	@RequestMapping(value="/pdfReport")
	public ModelAndView generarPDFJasperReport(@ModelAttribute Usuario filterUsuario, @ModelAttribute Pagination pagination,
			ModelMap modelMap,
			@RequestParam(value = "isInline", required = false) boolean isInline){
		
		//Acceso a BD para recuperar datos
		List<Usuario> usuarios = this.usuarioService.findAll(new Usuario(), null);
		
		//Nombre fichero
		modelMap.put("fileName", "datosPDF");
		
		//En línea (no descarga fichero) ?
		modelMap.put("isInline", isInline);
		
		//Titulo y cabeceras (parameter)
		modelMap.put("TITULO", "Listado usuarios");
		modelMap.put("COL_NOMBRE", "Nombre");
		modelMap.put("COL_APE1", "Apellido 1");
		modelMap.put("COL_APE2", "Apellido 2");
		
		//Datos (field)
		modelMap.put("usuarios", usuarios);
		
		//Generación del PDF
		return new ModelAndView("pdfUsuario", modelMap);
    }
}