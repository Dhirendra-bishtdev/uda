package com.ejie.x21a.dao;

import com.ejie.x38.dto.Pagination;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejie.x21a.model.MultiPk;

/**
 * MultiPkDaoImpl generated by UDA, 06-sep-2012 8:37:04.
 * @author UDA
 */
 
@Repository
@Transactional
public class MultiPkDaoImpl implements MultiPkDao {
    private JdbcTemplate jdbcTemplate;
	private RowMapper<MultiPk> rwMap = new RowMapper<MultiPk>() {
		public MultiPk mapRow(ResultSet resultSet, int rowNum) throws SQLException {
           return new MultiPk(
               resultSet.getBigDecimal("IDA"), resultSet.getBigDecimal("IDB"), resultSet.getString("NOMBRE"), resultSet.getString("APELLIDO1"), resultSet.getString("APELLIDO2")
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
     * Inserts a single row in the MultiPk table.
     *
     * @param multipk Pagination
     * @return MultiPk
     */
	public MultiPk add(MultiPk multipk) {
    	String query = "INSERT INTO MULTI_PK (IDA, IDB, NOMBRE, APELLIDO1, APELLIDO2) VALUES (?,?,?,?,?)";
		this.jdbcTemplate.update(query, multipk.getIda(), multipk.getIdb(), multipk.getNombre(), multipk.getApellido1(), multipk.getApellido2());
		return multipk;
	}

    /**
     * Updates a single row in the MultiPk table.
     *
     * @param multipk Pagination
     * @return MultiPk
     */
    public MultiPk update(MultiPk multipk) {
		String query = "UPDATE MULTI_PK SET NOMBRE=?, APELLIDO1=?, APELLIDO2=? WHERE IDA=? AND IDB=?";
		this.jdbcTemplate.update(query, multipk.getNombre(), multipk.getApellido1(), multipk.getApellido2(), multipk.getIda(), multipk.getIdb());
		return multipk;
	}

    /**
     * Finds a single row in the MultiPk table.
     *
     * @param multipk Pagination
     * @return MultiPk
     */
    @Transactional (readOnly = true)
    public MultiPk find(MultiPk multipk) {
		String query = "SELECT t1.IDA IDA, t1.IDB IDB, t1.NOMBRE NOMBRE, t1.APELLIDO1 APELLIDO1, t1.APELLIDO2 APELLIDO2 FROM MULTI_PK t1  WHERE t1.IDA = ?   AND t1.IDB = ?  ";
		
		List<MultiPk> multipkList = this.jdbcTemplate.query(query, this.rwMap, multipk.getIda() , multipk.getIdb());
		return (MultiPk) DataAccessUtils.uniqueResult(multipkList);
    }

    /**
     * Removes a single row in the MultiPk table.
     *
     * @param multipk Pagination
     * @return
     */
    public void remove(MultiPk multipk) {
		String query = "DELETE FROM MULTI_PK WHERE IDA=? AND IDB=?";
		this.jdbcTemplate.update(query, multipk.getIda() , multipk.getIdb());
    }
    
   /**
    * Finds a List of rows in the MultiPk table.
    * 
    * @param multipk MultiPk
    * @param pagination Pagination
    * @return List 
    */
	@Transactional (readOnly = true)
    public List<MultiPk> findAll(MultiPk multipk, Pagination pagination) {
		StringBuilder query = new StringBuilder("SELECT  t1.IDA IDA,t1.IDB IDB,t1.NOMBRE NOMBRE,t1.APELLIDO1 APELLIDO1,t1.APELLIDO2 APELLIDO2 "); 
		query.append("FROM MULTI_PK t1 ");
		
		//Where clause & Params
		Map<String, ?> mapaWhere = this.getWhereMap(multipk); 
		StringBuilder where = new StringBuilder(" WHERE 1=1 ");
		where.append(mapaWhere.get("query"));
		query.append(where);
		
		List<?> params = (List<?>) mapaWhere.get("params");

		if (pagination != null) {
			query = pagination.getPaginationQuery(query);
		}
		
		return (List<MultiPk>) this.jdbcTemplate.query(query.toString(), this.rwMap, params.toArray());
	}
	
    /**
     * Counts rows in the MultiPk table.
     * 
     * @param multipk MultiPk
     * @return Long
     */
    @Transactional (readOnly = true)
    public Long findAllCount(MultiPk multipk) {
		StringBuilder query = new StringBuilder("SELECT COUNT(1) FROM MULTI_PK t1 ");
		
		//Where clause & Params
		Map<String, ?> mapaWhere = this.getWhereMap(multipk); 
		StringBuilder where = new StringBuilder(" WHERE 1=1 ");
		where.append(mapaWhere.get("query"));
		query.append(where);		
		
		List<?> params = (List<?>) mapaWhere.get("params");
		
		return this.jdbcTemplate.queryForLong(query.toString(), params.toArray());
	}
	
	/**
	 * Finds rows in the MultiPk table using like.
     * 
     * @param multipk MultiPk
     * @param pagination Pagination
     * @param startsWith Boolean
     * @return List 
     */
	@Transactional (readOnly = true)
    public List<MultiPk> findAllLike(MultiPk multipk, Pagination pagination, Boolean startsWith) {
		StringBuilder query = new StringBuilder("SELECT  t1.IDA IDA,t1.IDB IDB,t1.NOMBRE NOMBRE,t1.APELLIDO1 APELLIDO1,t1.APELLIDO2 APELLIDO2 "); 
        query.append("FROM MULTI_PK t1 ");
      	
		//Where clause & Params
		Map<String, ?> mapaWhere = this.getWhereLikeMap(multipk,startsWith); 
		StringBuilder where = new StringBuilder(" WHERE 1=1 ");
		where.append(mapaWhere.get("query"));
		query.append(where);

		List<?> params = (List<?>) mapaWhere.get("params");

		if (pagination != null) {
			query = pagination.getPaginationQuery(query);
		}
		
		return (List<MultiPk>) this.jdbcTemplate.query(query.toString(), this.rwMap, params.toArray());
	}
	
	/**
	 * Counts rows in the MultiPk table using like.
     * 
     * @param multipk MultiPk
     * @param startsWith Boolean
     * @return Long 
     */
	@Transactional (readOnly = true)
    public Long findAllLikeCount(MultiPk multipk, Boolean startsWith) {
		StringBuilder query = new StringBuilder("SELECT COUNT(1) FROM MULTI_PK t1 ");

		//Where clause & Params
		Map<String, ?> mapaWhere = this.getWhereLikeMap(multipk,startsWith); 
		StringBuilder where = new StringBuilder(" WHERE 1=1 ");
		where.append(mapaWhere.get("query"));
		query.append(where);

		List<?> params = (List<?>) mapaWhere.get("params");

		return this.jdbcTemplate.queryForLong(query.toString(), params.toArray());
	}
	
	/**
	 * Returns a map with the needed value to create the conditions to filter by 
	 * the MultiPk entity 
	 * 
	 * @param multipk MultiPk
	 *            Bean with the criteria values to filter by.
	 * @return Map created with two keys
	 *         key query stores the sql query syntax
	 *         key params stores the parameter values to be used in the condition sentence.
	 */
	// CHECKSTYLE:OFF CyclomaticComplexity - Generación de código de UDA
	private Map<String, ?> getWhereMap (MultiPk multipk){
		
		StringBuffer where = new StringBuffer(MultiPkDaoImpl.STRING_BUILDER_INIT);
		List<Object> params = new ArrayList<Object>();

		if (multipk  != null  && multipk.getIda() != null ) {
			where.append(" AND t1.IDA = ?");
			params.add(multipk.getIda());
		}
		if (multipk  != null  && multipk.getIdb() != null ) {
			where.append(" AND t1.IDB = ?");
			params.add(multipk.getIdb());
		}
		if (multipk  != null  && multipk.getNombre() != null ) {
			where.append(" AND t1.NOMBRE = ?");
			params.add(multipk.getNombre());
		}
		if (multipk  != null  && multipk.getApellido1() != null ) {
			where.append(" AND t1.APELLIDO1 = ?");
			params.add(multipk.getApellido1());
		}
		if (multipk  != null  && multipk.getApellido2() != null ) {
			where.append(" AND t1.APELLIDO2 = ?");
			params.add(multipk.getApellido2());
		}

		Map<String,Object> mapWhere = new HashMap<String, Object>();
		mapWhere.put("query", where);
		mapWhere.put("params", params);
		
		return mapWhere;		
	}
	// CHECKSTYLE:ON CyclomaticComplexity - Generación de código de UDA
	
	/**
	 * Returns a map with the needed value to create the conditions to filter by  
	 * the MultiPk entity 
	 * 
	 * @param multipk MultiPk
	 *            Bean with the criteria values to filter by.
     * @param startsWith Boolean	 
	 * @return Map created with two keys
	 *         key query stores the sql query syntax
	 *         key params stores the parameter values to be used in the condition sentence.
	 */
	// CHECKSTYLE:OFF CyclomaticComplexity - Generación de código de UDA
	private Map<String, ?> getWhereLikeMap (MultiPk multipk, Boolean startsWith){
		
		StringBuffer where = new StringBuffer(MultiPkDaoImpl.STRING_BUILDER_INIT);
		List<Object> params = new ArrayList<Object>();

		if (multipk  != null  && multipk.getIda() != null ) {
			where.append(" AND t1.IDA = ?");
			params.add(multipk.getIda());
	     }			
		if (multipk  != null  && multipk.getIdb() != null ) {
			where.append(" AND t1.IDB = ?");
			params.add(multipk.getIdb());
	     }			
		if (multipk  != null  && multipk.getNombre() != null ) {
			where.append(" AND UPPER(t1.NOMBRE) like ? ESCAPE  '\\'");
			if (startsWith){
				params.add(multipk.getNombre().toUpperCase() +"%");
			}else{
				params.add("%"+multipk.getNombre().toUpperCase() +"%");
			}
			where.append(" AND t1.NOMBRE IS NOT NULL");
	     }			
		if (multipk  != null  && multipk.getApellido1() != null ) {
			where.append(" AND UPPER(t1.APELLIDO1) like ? ESCAPE  '\\'");
			if (startsWith){
				params.add(multipk.getApellido1().toUpperCase() +"%");
			}else{
				params.add("%"+multipk.getApellido1().toUpperCase() +"%");
			}
			where.append(" AND t1.APELLIDO1 IS NOT NULL");
	     }			
		if (multipk  != null  && multipk.getApellido2() != null ) {
			where.append(" AND UPPER(t1.APELLIDO2) like ? ESCAPE  '\\'");
			if (startsWith){
				params.add(multipk.getApellido2().toUpperCase() +"%");
			}else{
				params.add("%"+multipk.getApellido2().toUpperCase() +"%");
			}
			where.append(" AND t1.APELLIDO2 IS NOT NULL");
	     }			

		Map<String,Object> mapWhere = new HashMap<String, Object>();
		mapWhere.put("query", where);
		mapWhere.put("params", params);
		
		return mapWhere;		
	}
	// CHECKSTYLE:ON CyclomaticComplexity - Generación de código de UDA
	
	/**
	 * StringBuilder initilization value
	 */
	 public static final int STRING_BUILDER_INIT = 4096;}
