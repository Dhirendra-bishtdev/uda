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
import com.ejie.x21a.dao.DepartamentoProvinciaDao;
import com.ejie.x38.dto.Pagination;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejie.x21a.model.DepartamentoProvincia;
/**
 * DepartamentoProvinciaServiceImpl generated by UDA 1.0, 26-may-2011 13:45:00.
* @author UDA
*/
@Service(value = "departamentoProvinciaService")
public  class DepartamentoProvinciaServiceImpl implements DepartamentoProvinciaService {
    /**
    * Final static logger.
    */
    private static final  Logger  logger = LoggerFactory.getLogger(DepartamentoProvinciaServiceImpl.class);
@Autowired
    private DepartamentoProvinciaDao departamentoProvinciaDao;

   /**
    * Inserts a single row in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return DepartamentoProvincia
    */
	@Transactional(rollbackFor = Throwable.class)
    public DepartamentoProvincia add(DepartamentoProvincia departamentoProvincia) {
      return this.departamentoProvinciaDao.add(departamentoProvincia);
    }

    /**
    * Updates a single row in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return DepartamentoProvincia
    */
	@Transactional(rollbackFor = Throwable.class)
    public DepartamentoProvincia update(DepartamentoProvincia departamentoProvincia) {
      return this.departamentoProvinciaDao.update(departamentoProvincia);
    }

    /**
    * Finds a single row in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return DepartamentoProvincia
    */
    public DepartamentoProvincia find(DepartamentoProvincia departamentoProvincia) {
        return (DepartamentoProvincia) this.departamentoProvinciaDao.find(departamentoProvincia);
    }

    /**
     * Finds a List of rows in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @param pagination Pagination
     * @return List
     */
    public List<DepartamentoProvincia> findAll(DepartamentoProvincia departamentoProvincia, Pagination pagination) {
       return (List<DepartamentoProvincia>) this.departamentoProvinciaDao.findAll(departamentoProvincia, pagination);
    }
    /**
    * Counts rows in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return Long
    */
    public Long findAllCount(DepartamentoProvincia departamentoProvincia) {        
        return  this.departamentoProvinciaDao.findAllCount(departamentoProvincia);
    }

	 /**
     * Finds rows in the DepartamentoProvincia table using like.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @param pagination Pagination
     * @return List
     */
    public List<DepartamentoProvincia> findAllLike(DepartamentoProvincia departamentoProvincia, Pagination pagination, Boolean startsWith) {
       return (List<DepartamentoProvincia>) this.departamentoProvinciaDao.findAllLike(departamentoProvincia, pagination, startsWith);
    }
    /**
     * Deletes a single row in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     */
	@Transactional(rollbackFor = Throwable.class)
    public void remove(DepartamentoProvincia departamentoProvincia) {
        this.departamentoProvinciaDao.remove(departamentoProvincia);
    }
	
    /**
     * Deletes multiple rows in the DepartamentoProvincia table.
     *
     * @param departamentoProvinciaList ArrayList
     */
	@Transactional(rollbackFor = Throwable.class)
    public void removeMultiple(ArrayList<DepartamentoProvincia> departamentoProvinciaList) {
		for (DepartamentoProvincia  departamentoProvinciaAux:departamentoProvinciaList) {
            this.departamentoProvinciaDao.remove(departamentoProvinciaAux);
		}        
    }	

    /**
     *
     * @return DepartamentoProvinciaDao
     */
    public DepartamentoProvinciaDao getDepartamentoProvinciaDao() {
      return this.departamentoProvinciaDao;
    }
    /**
     *
     * @param  departamentoProvinciaDao DepartamentoProvinciaDao
     */
    public void setDepartamentoProvinciaDao(DepartamentoProvinciaDao departamentoProvinciaDao) {
        logger.info("Setting Dependency "+departamentoProvinciaDao);
        this.departamentoProvinciaDao = departamentoProvinciaDao;
    }
}
