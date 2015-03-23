/*
* Copyright 2011 E.J.I.E., S.A.
*
* Licencia con arreglo a la EUPL, VersiÃ³n 1.1 exclusivamente (la Â«LicenciaÂ»);
* Solo podrÃ¡ usarse esta obra si se respeta la Licencia.
* Puede obtenerse una copia de la Licencia en
*
* http://ec.europa.eu/idabc/eupl.html
*
* Salvo cuando lo exija la legislaciÃ³n aplicable o se acuerde por escrito,
* el programa distribuido con arreglo a la Licencia se distribuye Â«TAL CUALÂ»,
* SIN GARANTÃ�AS NI CONDICIONES DE NINGÃšN TIPO, ni expresas ni implÃ­citas.
* VÃ©ase la Licencia en el idioma concreto que rige los permisos y limitaciones
* que establece la Licencia.
*/
package com.ejie.x21a.model;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.ejie.x21a.validation.group.UsuarioEditValidation;
import com.ejie.x38.serialization.JsonDateDeserializer;
import com.ejie.x38.serialization.JsonDateSerializer;

/**
*  * Usuario generated by UDA 1.0, 26-may-2011 13:45:00.
 * @author UDA
 */

public class Usuario  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
            
			@NotBlank(message="validacion.required", groups={Default.class, UsuarioEditValidation.class})
			@Length(max=25, message="validacion.maxLength", groups={Default.class, UsuarioEditValidation.class})
            private String id;
            @NotBlank(message="validacion.required")
            @Length(max=25, message="validacion.maxLength")
            private String nombre;
            @Length(max=25, message="validacion.maxLength")
            private String apellido1;
            @Length(max=25, message="validacion.maxLength")
            private String apellido2;
//            @NotBlank(message="validacion.required")
            private String ejie;
            private String tipo;
            private String subtipo;
            @NotNull(message="validacion.required")
            private Date fechaAlta;
            private Date fechaBaja;
//            private List<PerfilUsuario> perfilUsuarios = new ArrayList<PerfilUsuario>();
            private Provincia provincia;
            private String rol;
            private String idPadre;

	/** Method 'Usuario'.
	*
	*/
    public Usuario() {
    }
    
    /** Method 'Usuario'.
	 * @param id
	 */
	public Usuario(String id) {
		super();
		this.id = id;
	}

	/** Method 'Usuario'.
    * @param id String
    * @param nombre String
    * @param apellido1 String
    * @param apellido2 String
    * @param ejie String
    * @param fechaAlta Date
    * @param fechaBaja Date
    * @param rol String
    */
    public Usuario(String id, String nombre, String apellido1, String apellido2, String ejie, Date fechaAlta, Date fechaBaja) {	
        this(id, nombre, apellido1, apellido2, ejie, fechaAlta, fechaBaja, null);
    }
    
    public Usuario(String id, String nombre, String apellido1, String apellido2, String ejie, Date fechaAlta, Date fechaBaja, String rol ) {	
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.ejie = ejie;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.rol = rol;
    }

    /**
	 * Method 'getId'.
	 *
	 * @return String
	 */
    @JsonSerialize()
    public String getId() {
		return this.id;
	}

	/**
	 * Method 'setId'.
	 *
	 * @param id String
     */
	
	public void setId(String id) {
		this.id = id;
	}
    /**
	 * Method 'getNombre'.
	 *
	 * @return String
	 */
	
	
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Method 'setNombre'.
	 *
	 * @param nombre String
     */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    /**
	 * Method 'getApellido1'.
	 *
	 * @return String
	 */
	
	
	public String getApellido1() {
		return this.apellido1;
	}

	/**
	 * Method 'setApellido1'.
	 *
	 * @param apellido1 String
     */
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
    /**
	 * Method 'getApellido2'.
	 *
	 * @return String
	 */
	
	
	public String getApellido2() {
		return this.apellido2;
	}

	/**
	 * Method 'setApellido2'.
	 *
	 * @param apellido2 String
     */
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
    /**
	 * Method 'getEjie'.
	 *
	 * @return String
	 */
	
	
	public String getEjie() {
		return this.ejie;
	}

	/**
	 * Method 'setEjie'.
	 *
	 * @param ejie String
     */
	
	public void setEjie(String ejie) {
		this.ejie = ejie;
	}
	
	
	/**
	 * Method 'getRol'.
	 * 
	 * @return rol String
	 */
    public String getRol() {
		return rol;
	}

    /**
     * Method 'setRol'.
     * 
     * @param rol String
     */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * Method 'getFechaAlta'.
	 *
	 * @return Date
	 */
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	/**
	 * Method 'setFechaAlta'.
	 *
	 * @param fechaAlta Date
     */
	@JsonDeserialize(using = JsonDateDeserializer.class)
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
    /**
	 * Method 'getFechaBaja'.
	 *
	 * @return Date
	 */
	
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	/**
	 * Method 'setFechaBaja'.
	 *
	 * @param fechaBaja Date
     */
	@JsonDeserialize(using = JsonDateDeserializer.class)
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	public String getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}
	
	/**
	 * Method 'getPerfilUsuarios'.
	 *
	 * @return List
	 */
//	@JsonIgnore
//	public List<PerfilUsuario> getPerfilUsuarios() {
//		return this.perfilUsuarios;
//	}
	
	/**
	 * Method 'setPerfilUsuarios'.
	 *
	 * @param perfilUsuarios List
	 * @return
	 */
//	public void setPerfilUsuarios(List<PerfilUsuario> perfilUsuarios) {
//		this.perfilUsuarios = perfilUsuarios;
//	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}
	
	
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	/**
	 * Intended only for logging and debugging.
	 * 
	 * Here, the contents of every main field are placed into the result.
	 * @return String
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.getClass().getName()).append(" Object { " ); 
		result.append(" [ id: ").append(this.id).append(" ]");
		result.append(", [ nombre: ").append(this.nombre).append(" ]");
		result.append(", [ apellido1: ").append(this.apellido1).append(" ]");
		result.append(", [ apellido2: ").append(this.apellido2).append(" ]");
		result.append(", [ ejie: ").append(this.ejie).append(" ]");
		result.append(", [ fechaAlta: ").append(this.fechaAlta).append(" ]");
		result.append(", [ fechaBaja: ").append(this.fechaBaja).append(" ]");
		result.append(", [ rol: ").append(this.rol).append(" ]");
		result.append("}");
		return result.toString();
	}
}

