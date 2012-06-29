/*
* Copyright 2011 E.J.I.E., S.A.
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
package com.ejie.x21a.service;
import com.ejie.x21a.dao.UsuarioDao;
import com.ejie.x38.dto.Pagination;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejie.x21a.model.Usuario;
/**
 * UsuarioServiceImpl generated by UDA 1.0, 26-may-2011 13:45:00.
* @author UDA
*/
@Service(value = "usuarioService")
public  class UsuarioServiceImpl implements UsuarioService {
    /**
    * Final static logger.
    */
    private static final  Logger  logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);
@Autowired
    private UsuarioDao usuarioDao;

   /**
    * Inserts a single row in the Usuario table.
    *
    * @param usuario Usuario
    * @return Usuario
    */
	@Transactional(rollbackFor = Throwable.class)
    public Usuario add(Usuario usuario) {
      return this.usuarioDao.add(usuario);
    }

    /**
    * Updates a single row in the Usuario table.
    *
    * @param usuario Usuario
    * @return Usuario
    */
	@Transactional(rollbackFor = Throwable.class)
    public Usuario update(Usuario usuario) {
      return this.usuarioDao.update(usuario);
    }

    /**
    * Finds a single row in the Usuario table.
    *
    * @param usuario Usuario
    * @return Usuario
    */
    public Usuario find(Usuario usuario) {
        return (Usuario) this.usuarioDao.find(usuario);
    }

    /**
     * Finds a List of rows in the Usuario table.
     *
     * @param usuario Usuario
     * @param pagination Pagination
     * @return List
     */
    public List<Usuario> findAll(Usuario usuario, Pagination pagination) {
       return (List<Usuario>) this.usuarioDao.findAll(usuario, pagination);
    }
    /**
    * Counts rows in the Usuario table.
    *
    * @param usuario Usuario
    * @return Long
    */
    public Long findAllCount(Usuario usuario) {        
        return  this.usuarioDao.findAllCount(usuario);
    }

	 /**
     * Finds rows in the Usuario table using like.
     *
     * @param usuario Usuario
     * @param pagination Pagination
     * @return List
     */
    public List<Usuario> findAllLike(Usuario usuario, Pagination pagination, Boolean startsWith) {
       return (List<Usuario>) this.usuarioDao.findAllLike(usuario, pagination, startsWith);
    }
    
    /**
     * Counts rows in the Usuario table using like.
     *
     * @param usuario Usuario
     * @return Long
     */
     public Long findAllLikeCount(Usuario usuario, Boolean startsWith) {        
         return  this.usuarioDao.findAllLikeCount(usuario, startsWith);
     }
    
    /**
     * Deletes a single row in the Usuario table.
     *
     * @param usuario Usuario
     */
	@Transactional(rollbackFor = Throwable.class)
    public void remove(Usuario usuario) {
        this.usuarioDao.remove(usuario);
    }
	
    /**
     * Deletes multiple rows in the Usuario table.
     *
     * @param usuarioList ArrayList
     */
	@Transactional(rollbackFor = Throwable.class)
    public void removeMultiple(ArrayList<Usuario> usuarioList) {
		for (Usuario  usuarioAux:usuarioList) {
            this.usuarioDao.remove(usuarioAux);
		}        
    }	

    /**
     *
     * @return UsuarioDao
     */
    public UsuarioDao getUsuarioDao() {
      return this.usuarioDao;
    }
    /**
     *
     * @param  usuarioDao UsuarioDao
     */
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        logger.info("Setting Dependency "+usuarioDao);
        this.usuarioDao = usuarioDao;
    }
}
