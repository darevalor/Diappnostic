package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PERMISO_X_ROL database table.
 * 
 */
@Entity
@Table(name="PERMISO_X_ROL")
@NamedQuery(name="PermisoXRol.findAll", query="SELECT p FROM PermisoXRol p")
public class PermisoXRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermisoXRolPK id;

	private String estado;

	//bi-directional many-to-one association to Funcionalidad
	@ManyToOne
	@JoinColumn(name="COD_FUNCIONALIDAD")
	private Funcionalidad funcionalidad;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="COD_ROL")
	private Rol rol;

	public PermisoXRol() {
	}

	public PermisoXRolPK getId() {
		return this.id;
	}

	public void setId(PermisoXRolPK id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Funcionalidad getFuncionalidad() {
		return this.funcionalidad;
	}

	public void setFuncionalidad(Funcionalidad funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}