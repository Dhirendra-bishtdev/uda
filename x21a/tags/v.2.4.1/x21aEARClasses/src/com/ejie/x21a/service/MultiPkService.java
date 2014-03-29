package com.ejie.x21a.service;


import com.ejie.x38.dto.Pagination;
import java.util.List;

import com.ejie.x21a.model.MultiPk;

/**
 * MultiPkService generated by UDA, 06-sep-2012 8:37:04.
 * @author UDA
 */

public interface MultiPkService {

	/**
	 * Inserts a single row in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @return MultiPk
	 */
    MultiPk add(MultiPk multiPk);

	/**
	 * Updates a single row in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @return MultiPk
	 */
	MultiPk update(MultiPk multiPk);

	/**
	 * Finds a single row in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @return MultiPk
	 */
	MultiPk find(MultiPk multiPk);

	/**
	 * Finds a List of rows in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @param pagination Pagination
	 * @return List
	 */
	List<MultiPk> findAll(MultiPk multiPk, Pagination pagination);

	/**
	 * Counts rows in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @return Long
	 */
	Long findAllCount(MultiPk multiPk);
	
	/**
	 * Finds rows in the MultiPk table using like.
	 *
	 * @param multiPk MultiPk
	 * @param pagination Pagination
     * @param startsWith Boolean	 
	 * @return List
	 */
	List<MultiPk> findAllLike(MultiPk multiPk, Pagination pagination, Boolean startsWith) ;

	/**
	 * Counts rows in the MultiPk table using like.
	 *
	 * @param multiPk MultiPk
     * @param startsWith Boolean	 
	 * @return Long
	 */
	Long findAllLikeCount(MultiPk multiPk, Boolean startsWith) ;
  
	/**
	 * Deletes a single row in the MultiPk table.
	 *
	 * @param multiPk MultiPk
	 * @return 
	 */
	void remove(MultiPk multiPk);
	
	/**
	 * Deletes multiple rows in the MultiPk table.
	 *
	 * @param multiPkList List
	 * @return 
	 */	
	void removeMultiple(List<MultiPk> multiPkList);
    
}

