package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ACIVIDAD_FISICA database table.
 * 
 */
@Entity
@Table(name="ACIVIDAD_FISICA")
@NamedQuery(name="AcividadFisica.findAll", query="SELECT a FROM AcividadFisica a")
public class AcividadFisica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long codigo;

	private String nombre;

	//bi-directional many-to-one association to Episodio
	@OneToMany(mappedBy="acividadFisica")
	private List<Episodio> episodios;

	public AcividadFisica() {
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Episodio> getEpisodios() {
		return this.episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public Episodio addEpisodio(Episodio episodio) {
		getEpisodios().add(episodio);
		episodio.setAcividadFisica(this);

		return episodio;
	}

	public Episodio removeEpisodio(Episodio episodio) {
		getEpisodios().remove(episodio);
		episodio.setAcividadFisica(null);

		return episodio;
	}

}