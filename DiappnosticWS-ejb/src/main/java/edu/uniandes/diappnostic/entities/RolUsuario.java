package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ROL_USUARIO database table.
 * 
 */
@Entity
@Table(name="ROL_USUARIO")
@NamedQuery(name="RolUsuario.findAll", query="SELECT r FROM RolUsuario r")
public class RolUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolUsuarioPK id;

	private String estado;

	@Column(name="NUM_DOC_MEDICO")
	private BigDecimal numDocMedico;

	//bi-directional many-to-one association to Episodio
	@OneToMany(mappedBy="rolUsuario")
	private List<Episodio> episodios;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="COD_ROL")
	private Rol rol;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="NUM_DOC_USUARIO")
	private Usuario usuario;

	public RolUsuario() {
	}

	public RolUsuarioPK getId() {
		return this.id;
	}

	public void setId(RolUsuarioPK id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getNumDocMedico() {
		return this.numDocMedico;
	}

	public void setNumDocMedico(BigDecimal numDocMedico) {
		this.numDocMedico = numDocMedico;
	}

	public List<Episodio> getEpisodios() {
		return this.episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public Episodio addEpisodio(Episodio episodio) {
		getEpisodios().add(episodio);
		episodio.setRolUsuario(this);

		return episodio;
	}

	public Episodio removeEpisodio(Episodio episodio) {
		getEpisodios().remove(episodio);
		episodio.setRolUsuario(null);

		return episodio;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}