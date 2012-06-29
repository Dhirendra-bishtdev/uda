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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejie.x21a.model.NoraPais;
import com.ejie.x38.dto.Pagination;
import com.ejie.x38.util.PaginationManager;

/**
 *  * NoraPaisDaoImpl generated by UDA, 18-ene-2012 11:57:47.
 * @author UDA
 */
 
@Repository
@Transactional
public class NoraPaisDaoImpl implements NoraPaisDao {
    private JdbcTemplate jdbcTemplate;
	private RowMapper<NoraPais> rwMap = new RowMapper<NoraPais>() {
		public NoraPais mapRow(ResultSet resultSet, int rowNum) throws SQLException {
           return new NoraPais(
               resultSet.getString("ID"), resultSet.getString("DSO")
           ); } } ;

	/**
     * Method use to set the datasource.
     *
     * @param dataSource DataSource
     * @return
     */
    @Resource
    public void setDataSource(DataSource dataSource) {
    	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    


    /**
     * Finds a single row in the NoraPais table.
     *
     * @param pais Pagination
     * @return NoraPais
     */
    @Transactional (readOnly = true)
    public NoraPais find(NoraPais pais) {
		String query = "SELECT t1.ID ID, t1.DS_O DSO " 
         + "FROM T17_PAIS t1  " 
         + "WHERE t1.ID = ?   AND t1.DS_O = ?  ";
		return (NoraPais) this.jdbcTemplate.queryForObject(query, 
			rwMap , pais.getId() , pais.getDsO());	 
    }

   
   /**
    * Finds a List of rows in the NoraPais table.
    * 
    * @param pais NoraPais
    * @param pagination Pagination
    * @return List 
    */
	@Transactional (readOnly = true)
    public List<NoraPais> findAll(NoraPais pais, Pagination pagination) {
		StringBuffer where = new StringBuffer(3000);
		List<Object> params = new ArrayList<Object>();
		where.append(" WHERE 1=1 	");
		
		StringBuffer query = new StringBuffer("SELECT  t1.ID ID,t1.DS_O DSO " 
			+ "FROM T17_PAIS t1 ");
		
		if (pais  != null  && pais.getId() != null ) {
			where.append(" AND t1.ID = ?");
			params.add(pais.getId());
		}
		if (pais  != null  && pais.getDsO() != null ) {
			where.append(" AND t1.DS_O = ?");
			params.add(pais.getDsO());
		}
		query.append(where);

		StringBuffer order = new StringBuffer(3000);
		if (pagination != null) {
			if (pagination.getSort() != null) {
				order.append(" ORDER BY " + pagination.getSort() + " " + pagination.getAscDsc());
				query.append(order);
			}
			query = new StringBuffer(PaginationManager.getQueryLimits(pagination,query.toString()));
		}
		return (List<NoraPais>) this.jdbcTemplate.query(query.toString(),rwMap, params.toArray());
	}
	
    /**
     * Counts rows in the NoraPais table.
     * 
     * @param pais NoraPais
     * @return Long
     */
    @Transactional (readOnly = true)
    public Long findAllCount(NoraPais pais) {

		StringBuffer where = new StringBuffer(3000);
		List<Object> params = new ArrayList<Object>();
		where.append(" WHERE 1=1  ");

		StringBuffer query = new StringBuffer("SELECT COUNT(1) FROM  T17_PAIS t1  ");
		if (pais  != null  && pais.getId() != null ) {
			where.append(" AND t1.ID = ?");
			params.add(pais.getId());
		}
		if (pais  != null  && pais.getDsO() != null ) {
			where.append(" AND t1.DS_O = ?");
			params.add(pais.getDsO());
		}
		query.append(where);
		return this.jdbcTemplate.queryForLong(query.toString(), params.toArray());
	}
	
	/**
	 * Finds rows in the NoraPais table using like.
     * 
     * @param pais NoraPais
     * @param pagination Pagination
     * @param startsWith Boolean
     * @return List 
     */
	@Transactional (readOnly = true)
    public List<NoraPais> findAllLike(NoraPais pais, Pagination pagination, Boolean startsWith) {
		StringBuffer where = new StringBuffer(3000);
		List<Object> params = new ArrayList<Object>();
		where.append(" WHERE 1=1 	");
		
		StringBuffer query = new StringBuffer("SELECT  t1.ID ID,t1.DS_O DSO " 
        	+ "FROM T17_PAIS t1 ");
      	
		if (pais  != null  && pais.getId() != null ) {
			where.append(" AND UPPER(t1.ID) like ? ESCAPE  '\\'");
			if (startsWith){
				params.add(pais.getId() +"%");
			}else{
				params.add("%"+pais.getId() +"%");
			}	
			where.append(" AND t1.ID IS NOT NULL");
        }
		if (pais  != null  && pais.getDsO() != null ) {
			where.append(" AND UPPER(t1.DS_O) like ? ESCAPE  '\\'");
			if (startsWith){
				params.add(pais.getDsO().toUpperCase()  +"%");
			}else{
				params.add("%"+pais.getDsO().toUpperCase() +"%");
			}	
			where.append(" AND t1.DS_O IS NOT NULL");
        }
        query.append(where);

		StringBuffer order = new StringBuffer(3000);
		if (pagination != null) {
			if (pagination.getSort() != null) {
				order.append(" ORDER BY " + pagination.getSort() + " " + pagination.getAscDsc());
				query.append(order);
			}
			query = new StringBuffer(PaginationManager.getQueryLimits(pagination,query.toString()));
		}
		return (List<NoraPais>) this.jdbcTemplate.query(query.toString(),rwMap, params.toArray());
	}
}
