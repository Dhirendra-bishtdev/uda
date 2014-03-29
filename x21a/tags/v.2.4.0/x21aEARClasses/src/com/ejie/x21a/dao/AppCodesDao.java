package com.ejie.x21a.dao;

import java.util.List;

/**
 *  * AppCodesDao generated by UDA, 01-mar-2012 9:33:10.
 * @author UDA
 */

public interface AppCodesDao {
    
	/**
     * Inserts a single row in the Appcodes table.
     *
     * @param userName String
     * @param appCode String
     * @return
     */
    void add(String user, String aplic);

    /**
     * Updates a single row in the Appcodes table.
     *
     * @param userName String
     * @param appCode String
     * @param newAppCode String
     * @return
     */
    void update(String userName, String appCode, String newAppCode);

    /**
     * Removes a single row in the Appcodes table.
     *
     * @param userName String
     * @param appCode String
     * @return
     */
    void remove(String user, String aplic);

    /**
     * Finds a single row in the Appcodes table.
     *
     * @param userName String
     * @return ArrayList<String>
     */
    List<String>  find(String userName);

    	
}
