package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ROL_USUARIO database table.
 * 
 */
@Embeddable
public class RolUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NUM_DOC_USUARIO", insertable=false, updatable=false)
	private long numDocUsuario;

	@Column(name="COD_ROL", insertable=false, updatable=false)
	private long codRol;

	public RolUsuarioPK() {
	}
	public long getNumDocUsuario() {
		return this.numDocUsuario;
	}
	public void setNumDocUsuario(long numDocUsuario) {
		this.numDocUsuario = numDocUsuario;
	}
	public long getCodRol() {
		return this.codRol;
	}
	public void setCodRol(long codRol) {
		this.codRol = codRol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolUsuarioPK)) {
			return false;
		}
		RolUsuarioPK castOther = (RolUsuarioPK)other;
		return 
			(this.numDocUsuario == castOther.numDocUsuario)
			&& (this.codRol == castOther.codRol);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.numDocUsuario ^ (this.numDocUsuario >>> 32)));
		hash = hash * prime + ((int) (this.codRol ^ (this.codRol >>> 32)));
		
		return hash;
	}
}