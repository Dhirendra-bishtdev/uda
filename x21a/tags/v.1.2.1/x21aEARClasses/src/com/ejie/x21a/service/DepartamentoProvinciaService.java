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


import com.ejie.x38.dto.Pagination;
import java.util.ArrayList;
import java.util.List;

import com.ejie.x21a.model.DepartamentoProvincia;

/**
 * DepartamentoProvinciaService generated by UDA 1.0, 26-may-2011 13:45:00.
* @author UDA
*/
public interface DepartamentoProvinciaService {

    /**
     * Inserts a single row in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @return DepartamentoProvincia
     */
    DepartamentoProvincia add(DepartamentoProvincia departamentoProvincia);

    /**
     * Updates a single row in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @return DepartamentoProvincia
     */
    DepartamentoProvincia update(DepartamentoProvincia departamentoProvincia);

    /**
    * Finds a single row in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return DepartamentoProvincia
    */
    DepartamentoProvincia find(DepartamentoProvincia departamentoProvincia);

    /**
     * Finds a List of rows in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @param pagination Pagination
     * @return List
     */
    List<DepartamentoProvincia> findAll(DepartamentoProvincia departamentoProvincia, Pagination pagination);

    /**
    * Counts rows in the DepartamentoProvincia table.
    *
    * @param departamentoProvincia DepartamentoProvincia
    * @return Long
    */
    Long findAllCount(DepartamentoProvincia departamentoProvincia);
    /**
     * Finds rows in the DepartamentoProvincia table using like.
     *
     * @param departamentoProvincia DepartamentoProvincia
     * @param pagination Pagination
     * @return List
     */
      List<DepartamentoProvincia> findAllLike(DepartamentoProvincia departamentoProvincia, Pagination pagination, Boolean startsWith) ;
  
    /**
     * Deletes a single row in the DepartamentoProvincia table.
     *
     * @param departamentoProvincia DepartamentoProvincia
     */
    void remove(DepartamentoProvincia departamentoProvincia);
	
    /**
     * Deletes multiple rows in the DepartamentoProvincia table.
     *
     * @param departamentoProvinciaList  ArrayList
     */	
	void removeMultiple(ArrayList<DepartamentoProvincia> departamentoProvinciaList);
    
}

