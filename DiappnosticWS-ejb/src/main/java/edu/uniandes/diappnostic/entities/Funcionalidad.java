package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FUNCIONALIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Funcionalidad.findAll", query="SELECT f FROM Funcionalidad f")
public class Funcionalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long codigo;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to PermisoXRol
	@OneToMany(mappedBy="funcionalidad")
	private List<PermisoXRol> permisoXRols;

	public Funcionalidad() {
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<PermisoXRol> getPermisoXRols() {
		return this.permisoXRols;
	}

	public void setPermisoXRols(List<PermisoXRol> permisoXRols) {
		this.permisoXRols = permisoXRols;
	}

	public PermisoXRol addPermisoXRol(PermisoXRol permisoXRol) {
		getPermisoXRols().add(permisoXRol);
		permisoXRol.setFuncionalidad(this);

		return permisoXRol;
	}

	public PermisoXRol removePermisoXRol(PermisoXRol permisoXRol) {
		getPermisoXRols().remove(permisoXRol);
		permisoXRol.setFuncionalidad(null);

		return permisoXRol;
	}

}