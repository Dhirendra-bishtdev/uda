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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ejie.x21a.model.Localidad;
import com.ejie.x21a.model.Usuario;
import com.ejie.x21a.service.JQGridLocalidadService;
import com.ejie.x21a.service.JQGridUsuarioService;
import com.ejie.x38.control.bind.annotation.RequestJsonBody;
import com.ejie.x38.dto.JQGridRequestDto;
import com.ejie.x38.dto.JQGridResponseDto;
import com.ejie.x38.dto.JerarquiaDto;
import com.ejie.x38.util.ObjectConversionManager;

/**
 * UsuarioServiceImpl generated by UDA 1.0, 26-may-2011 13:46:35.
* @author UDA
 */
@Controller
@RequestMapping (value = "/jqGridLocalidad")
public class JQGridLocalidadController  {

	private static final Logger logger = LoggerFactory.getLogger(JQGridLocalidadController.class);

	@Autowired
	private JQGridUsuarioService jqGridUsuarioService;
	
	@Autowired 
	private JQGridLocalidadService localidadService;
	
	
	/**
	 * Method 'getById'.
	 *
	 * @param code BigDecimal
	 * @return localidad Localidad
	 */
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody Localidad getById(@PathVariable BigDecimal code) {
        Localidad localidad = new Localidad();
		localidad.setCode(code);
        localidad = this.localidadService.find(localidad);
        JQGridLocalidadController.logger.info("[GET - findBy_PK] : Obtener Localidad por PK");
        return localidad;
	}
	
	/**
	 * Method 'edit'.
	 *
	 * @param localidad Localidad 
	 * @return Localidad
	 */
	@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Localidad edit(@RequestBody Localidad localidad) {		
        Localidad localidadAux = this.localidadService.update(localidad);
        JQGridLocalidadController.logger.info("[PUT] : Localidad actualizado correctamente");
        return localidadAux;
    }

	/**
	 * Method 'add'.
	 *
	 * @param localidad Localidad 
	 * @return Localidad
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Localidad add(@RequestBody Localidad localidad) {		
        Localidad localidadAux = this.localidadService.add(localidad);
        JQGridLocalidadController.logger.info("[POST] : Localidad insertado correctamente");
    	return localidadAux;
	}

	/**
	 * Method 'remove'.
	 *
	 * @param code BigDecimal
	 * @return localidad
	 */
	@RequestMapping(value = "/{code}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody Localidad remove(@PathVariable BigDecimal code) {
        Localidad localidad = new Localidad();
        localidad.setCode(code);
        this.localidadService.remove(localidad);
        JQGridLocalidadController.logger.info("[DELETE] : Localidad borrado correctamente");
       	return localidad;
    }
	
	 /**
	  * RUP_TABLE
	  */
		
//		@Json(mixins={@JsonMixin(target=Usuario.class, mixin=UsuarioMixIn.class)})
		@RequestMapping(value = "/filter", method = RequestMethod.POST)
		public @ResponseBody JQGridResponseDto<Localidad> filter(
				@RequestJsonBody(param="filter") Localidad localidad,
				@RequestJsonBody JQGridRequestDto jqGridRequestDto) {
			JQGridLocalidadController.logger.info("[GET - jqGrid] : Obtener Usuarios");
			
			return localidadService.filter(localidad, jqGridRequestDto, false);
		}
		
		@RequestMapping(value = "/search", method = RequestMethod.POST)
		public @ResponseBody Object search(
				@RequestJsonBody(param="filter") Localidad localidadFilter,
				@RequestJsonBody(param="search") Localidad localidadSearch,
				@RequestJsonBody JQGridRequestDto jqGridRequestDto){
			
			JQGridLocalidadController.logger.info("[GET - find_ALL] : Obtener Usuarios por filtro");
			return localidadService.search(localidadFilter, localidadSearch, jqGridRequestDto, true);
		}
		
	/**
	 * N/A	
	 */
		
		/**
		 * Method 'getAllCount'.
		 * @param filterUsuario Usuario 
		 * @return Long
//		 */
//		@RequestMapping(value = "/count", method = RequestMethod.GET)
//		public @ResponseBody Long getAllCount(@RequestParam(value = "usuario", required = false) Usuario  filterUsuario) {
//			return jqGridUsuarioService.findAllLikeCount(filterUsuario != null ? filterUsuario: new Usuario (),false);
//		}
		
		
		
//		 /**
//		 * Method 'removeAll'.
//		 * @param  usuarioIds  ArrayList
//		 *
//		 */	
//		@RequestMapping(value = "/deleteAll", method = RequestMethod.POST)
//		@ResponseStatus(value=HttpStatus.OK)
//		public @ResponseBody List<List<String>> removeMultiple(@RequestBody List<List<String>> usuarioIds) {
//		List<Localidad> usuarioList = new ArrayList<Localidad>();
//        for (List<String> usuarioId:usuarioIds) {
//		    Iterator<String> iterator = usuarioId.iterator();
//		    	Localidad usuario = new Localidad();
//		        usuario.setCode(code)(usuarioId);
//			    usuarioList.add(usuario);
//	    }
//        this.localidadService.removeMultiple(usuarioList);
//        logger.info("All entities correctly deleted!");
//        return usuarioIds;
//	}	
}