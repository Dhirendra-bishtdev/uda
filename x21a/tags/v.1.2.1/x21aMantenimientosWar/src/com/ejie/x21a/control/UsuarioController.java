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
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ejie.x21a.model.Usuario;
import com.ejie.x21a.service.UsuarioService;
import com.ejie.x38.control.exception.ControlException;
import com.ejie.x38.control.exception.MethodFailureException;
import com.ejie.x38.control.exception.ResourceNotFoundException;
import com.ejie.x38.control.exception.ServiceUnavailableException;
import com.ejie.x38.dto.JQGridJSONModel;
import com.ejie.x38.dto.Pagination;
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
	
	@Autowired
	private Properties appConfiguration;
	
	//Selección simple
	@RequestMapping(value = "simple", method = RequestMethod.GET)
	public ModelAndView getSimple(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("simple", "model", model);
	}
	//Multiselección
	@RequestMapping(value = "multi", method = RequestMethod.GET)
	public ModelAndView getMulti(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("multi", "model", model);
	}
	
	//Llamadas ajax de mantenimientos
	@RequestMapping(value = "simpleTable1", method = RequestMethod.GET)
	public ModelAndView getMaintSimple1(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("simpleTable1", "model", model);
	}
	@RequestMapping(value = "simpleTable2", method = RequestMethod.GET)
	public ModelAndView getMaintSimple2(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("simpleTable2", "model", model);
	}
	@RequestMapping(value = "simpleTable3", method = RequestMethod.GET)
	public ModelAndView getMaintSimple3(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("simpleTable3", "model", model);
	}
	@RequestMapping(value = "editTable1", method = RequestMethod.GET)
	public ModelAndView getEditMaint1(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("editMaint1", "model", model);
	}
	@RequestMapping(value = "multiTable1", method = RequestMethod.GET)
	public ModelAndView getMultiMaint1(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("multiMaint1", "model", model);
	}
	
	//Multiselección agrupada
	@RequestMapping(value = "groupMulti", method = RequestMethod.GET)
	public ModelAndView getGroupMulti(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("groupMulti", "model", model);
	}
	//Edición en línea
	@RequestMapping(value = "edlinea", method = RequestMethod.GET)
	public ModelAndView getCreateForm(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("edlinea", "model", model);
	}
	//Selección simple [diseño líquido]
	@RequestMapping(value = "simpleFluido", method = RequestMethod.GET)
	public ModelAndView getSimpleFluido(Model model) {
		model.addAttribute("defaultLanguage", appConfiguration.get("x21aMantenimientosWar.default.language"));
		model.addAttribute("defaultLayout", appConfiguration.get("x21aMantenimientosWar.default.layout"));
		return new ModelAndView("simpleFluido", "model", model);
	}
	 /**
	 * Method 'getById'.
	 * @param  id String
	 * @return String
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Usuario getById(@PathVariable String id) {
		try{
            Usuario usuario = new Usuario();
			usuario.setId(id);
            usuario = this.usuarioService.find(usuario);
            if (usuario == null) {
                throw new Exception(id.toString());
            }
            return usuario;
		}catch (Exception e){
		    throw new ResourceNotFoundException(id.toString());
		}
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
			HttpServletRequest request) {
			try{
				Usuario filterUsuario = new Usuario(id, nombre, apellido1, apellido2, ejie, fechaAlta, fechaBaja);
                Pagination pagination = null;
			    if (request.getHeader("JQGridModel") != null &&  request.getHeader("JQGridModel").equals("true")) {
				    pagination = new Pagination();
				    pagination.setPage(Long.valueOf(request.getParameter("page")));
				    pagination.setRows(Long.valueOf(request.getParameter("rows")));
				    pagination.setSort(request.getParameter("sidx"));
				    pagination.setAscDsc(request.getParameter("sord"));
                    List<Usuario> usuarios =  this.usuarioService.findAllLike(filterUsuario, pagination, false);

     			    if (usuarios == null) {
	    	            throw new Exception("No data Found.");
		            }
					
			        Long total =  getAllCount(filterUsuario, request);
				    JQGridJSONModel data = new JQGridJSONModel();
				    data.setPage(request.getParameter("page"));
				    data.setRecords(total.intValue());
				    data.setTotal(total, pagination.getRows());
				    data.setRows(usuarios);
				    return data;
				}else{
				    List<Usuario> usuarios =  this.usuarioService.findAllLike(filterUsuario, pagination, false);
					if (usuarios == null) {
	    	            throw new Exception("No data Found.");
		            }
				    return usuarios;
				}
            }catch(Exception e){
			    throw new ResourceNotFoundException("No data Found.");
			}
	}

	/**
	 * Method 'getAllCount'.
	 * @param filterUsuario Usuario 
	 * @param request  HttpServletRequest
	 * @return Long
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public @ResponseBody Long getAllCount(
	@RequestParam(value = "usuario", required = false) Usuario  filterUsuario, HttpServletRequest request) {
	    try {
			return usuarioService
					.findAllLikeCount(filterUsuario != null ? filterUsuario
							: new Usuario (),false);
		} catch (Exception e) {
			throw new ServiceUnavailableException("Count Service is not responding.");
		}
	}
	
	 /**
	 * Method 'edit'.
	 * @param	 usuario Usuario 
	 * @param response  HttpServletResponse
	 * @return Usuario
	 */
	@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Usuario edit(@RequestBody Usuario usuario, HttpServletResponse response) {		
		try {
            Usuario usuarioAux  = this.usuarioService.update(usuario);
			logger.info( "Entity correctly inserted!");
            return usuarioAux;
        } catch(Exception e) {
            throw new MethodFailureException("Method failed");
        }
    }

	 /**
	 * Method 'add'.
	 * @param	 usuario Usuario 
	 * @return Usuario
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Usuario add(@RequestBody Usuario usuario) {		
        try {
            Usuario usuarioAux = this.usuarioService.add(usuario);
            logger.info( "Entity correctly inserted!");
        	return usuarioAux;
		} catch(Exception e) {
        	throw new MethodFailureException("Method failed");
		}
	}

	 /**
	 * Method 'remove'.
	 * @param  id  String
	 * @param response  HttpServletResponse
	 *
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove(
				@PathVariable String id,
					HttpServletResponse  response) {
        response.setContentType("text/javascript;charset=utf-8");
        response.setHeader("Pragma", "cache");
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control", "private");
    	try{
            Usuario usuario = new Usuario();
            usuario.setId(id);
            this.usuarioService.remove(usuario);
            response.setStatus(HttpServletResponse.SC_OK);
    	} catch(Exception e) {
    		logger.error( "Unable to delete " +  id);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    		throw new MethodFailureException("Method failed");
    	}
    }
	
	 /**
	 * Method 'removeAll'.
	 * @param  usuarioIds  ArrayList
	 * @param response  HttpServletResponse
	 *
	 */	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.POST)
	public void removeMultiple(@RequestBody ArrayList<ArrayList<String>> usuarioIds,
			HttpServletResponse response) {
        response.setContentType("text/javascript;charset=utf-8");
        response.setHeader("Pragma", "cache");
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control", "private");
        ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
        try{		    
            for (ArrayList<String> usuarioId:usuarioIds) {
			    Iterator<String> iterator = usuarioId.iterator();
				    Usuario usuario = new Usuario();
			        usuario.setId(ObjectConversionManager.convert(iterator.next(), String.class));
				    usuarioList.add(usuario);
		    }
            this.usuarioService.removeMultiple(usuarioList);
			response.setStatus(HttpServletResponse.SC_OK);
		} catch(Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			throw new MethodFailureException("Method failed");
		}
	}	

	/**
	 * Method 'handle'.
	 * @param e ControlException
	 * @return String
	 *
	 */
	@ExceptionHandler
	public @ResponseBody String handle(ControlException e) {
		logger.warn( e.getMessage());
		return e.getMessage();
	}

	/**
	 * Method 'getUsuarioService'.
	 *
	 * @return UsuarioService
	 *
	 */
	protected UsuarioService getUsuarioService() {
		return this.usuarioService;
	}

	/**
	 * Method 'setUsuarioService'.
	 *
	 * @param usuarioService  UsuarioService
	 *
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	/**
	 * Method 'getAppConfiguration'.
	 * 
	 * @return appConfiguration
	 * 
	 */
	public Properties getAppConfiguration() {
		return appConfiguration;
	}

	/**
	 * Method 'setAppConfiguration'.
	 * 
	 * @paramappConfiguration Properties
	 * 
	 */
	public void setAppConfiguration(Properties appConfiguration) {
		this.appConfiguration = appConfiguration;
	}
}	
	