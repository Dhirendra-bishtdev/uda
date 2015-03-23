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

package com.ejie.x21a.dao;

import com.ejie.x38.dto.Pagination;
import java.util.List;

import com.ejie.x21a.model.NoraCalle;

/**
 *  * NoraCalleDao generated by UDA, 16-ene-2012 13:17:20.
 * @author UDA
 */

public interface NoraCalleDao {
    
    /**
     * Inserts a single row in the Calle table.
     *
     * @param calle Calle
     * @return Calle
     */
    NoraCalle add(NoraCalle calle);

    /**
     * Updates a single row in the Calle table.
     *
     * @param calle Calle
     * @return Calle
     */
    NoraCalle update(NoraCalle calle);

    /**
     * Finds a single row in the Calle table.
     *
     * @param calle Calle
     * @return Calle
     */
    NoraCalle find(NoraCalle calle);

    /**
     * Deletes a single row in the Calle table.
     *
     * @param calle Calle
     * @return 
     */
    void remove(NoraCalle calle);

    /**
     * Finds a List of rows in the Calle table.
     *
     * @param calle Calle
     * @param pagination Pagination
     * @return List
     */
    List<NoraCalle> findAll(NoraCalle calle, Pagination pagination);

    /**
     * Counts rows in the Calle table.
     *
     * @param calle Calle
     * @return List
     */
    Long findAllCount(NoraCalle calle);
	
	/**
     * Finds rows in the Calle table using like.
     *
     * @param calle Calle
     * @param pagination Pagination
     * @param startsWith Boolean
     * @return List
     */
	List<NoraCalle> findAllLike(NoraCalle calle, Pagination pagination, Boolean startsWith);
}

