package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LOCALIZACION_DOLOR database table.
 * 
 */
@Entity
@Table(name="LOCALIZACION_DOLOR")
@NamedQuery(name="LocalizacionDolor.findAll", query="SELECT l FROM LocalizacionDolor l")
public class LocalizacionDolor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long codigo;

	private String nombre;

	//bi-directional many-to-one association to Episodio
	@OneToMany(mappedBy="localizacionDolor")
	private List<Episodio> episodios;

	public LocalizacionDolor() {
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
		episodio.setLocalizacionDolor(this);

		return episodio;
	}

	public Episodio removeEpisodio(Episodio episodio) {
		getEpisodios().remove(episodio);
		episodio.setLocalizacionDolor(null);

		return episodio;
	}

}