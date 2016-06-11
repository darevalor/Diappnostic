package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIAGNOSTICO database table.
 * 
 */
@Entity
@NamedQuery(name="Diagnostico.findAll", query="SELECT d FROM Diagnostico d")
public class Diagnostico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIAGNOSTICO_CONSECUTIVO_GENERATOR", sequenceName="SEQ_DIAGNOSTICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIAGNOSTICO_CONSECUTIVO_GENERATOR")
	private long consecutivo;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="NUM_DOC_PACIENTE")
	private BigDecimal numDocPaciente;

	@Column(name="POR_ACTIVIDAD")
	private String porActividad;

	@Column(name="POR_MEDICAMENTO")
	private String porMedicamento;

	//bi-directional many-to-one association to Episodio
	@ManyToOne
	@JoinColumn(name="CONSECUTIVO_EPISODIO")
	private Episodio episodio;

	public Diagnostico() {
	}

	public long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getNumDocPaciente() {
		return this.numDocPaciente;
	}

	public void setNumDocPaciente(BigDecimal numDocPaciente) {
		this.numDocPaciente = numDocPaciente;
	}

	public String getPorActividad() {
		return this.porActividad;
	}

	public void setPorActividad(String porActividad) {
		this.porActividad = porActividad;
	}

	public String getPorMedicamento() {
		return this.porMedicamento;
	}

	public void setPorMedicamento(String porMedicamento) {
		this.porMedicamento = porMedicamento;
	}

	public Episodio getEpisodio() {
		return this.episodio;
	}

	public void setEpisodio(Episodio episodio) {
		this.episodio = episodio;
	}

}