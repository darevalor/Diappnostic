package edu.uniandes.diappnostic.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EPISODIO database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Episodio.findAll", query="SELECT e FROM Episodio e"),
	@NamedQuery(name="Episodio.episodiosUsuario", query="SELECT e FROM Episodio e where e.rolUsuario.usuario.numDoc = :docUsuario and e.rolUsuario.rol.codigo = :codRol")
})
public class Episodio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EPISODIO_CONSECUTIVO_GENERATOR", sequenceName="SEQ_EPISODIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EPISODIO_CONSECUTIVO_GENERATOR")
	private long consecutivo;

	@Column(name="ALIMENTOS_CONSUMIDOS")
	private String alimentosConsumidos;

	@Column(name="DESCRIPCION_VOZ")
	private String descripcionVoz;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="IP_SERVIDOR")
	private String ipServidor;

	@Column(name="NIVEL_DOLOR")
	private BigDecimal nivelDolor;

	@Column(name="PRESENTA_SOMNOLENCIA")
	private String presentaSomnolencia;

	//bi-directional many-to-one association to Diagnostico
	@OneToMany(mappedBy="episodio")
	private List<Diagnostico> diagnosticos;

	//bi-directional many-to-one association to AcividadFisica
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="COD_ACTIVIDAD")
	private AcividadFisica acividadFisica;

	//bi-directional many-to-one association to LocalizacionDolor
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="COD_LOCALIZACION")
	private LocalizacionDolor localizacionDolor;

	//bi-directional many-to-one association to Medicamento
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="COD_MEDICAMENTO")
	private Medicamento medicamento;

	//bi-directional many-to-one association to RolUsuario
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name="COD_ROL_USUARIO", referencedColumnName="COD_ROL"),
		@JoinColumn(name="NUM_DOC_USUARIO", referencedColumnName="NUM_DOC_USUARIO")
		})
	private RolUsuario rolUsuario;

	public Episodio() {
	}

	public long getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getAlimentosConsumidos() {
		return this.alimentosConsumidos;
	}

	public void setAlimentosConsumidos(String alimentosConsumidos) {
		this.alimentosConsumidos = alimentosConsumidos;
	}

	public String getDescripcionVoz() {
		return this.descripcionVoz;
	}

	public void setDescripcionVoz(String descripcionVoz) {
		this.descripcionVoz = descripcionVoz;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIpServidor() {
		return this.ipServidor;
	}

	public void setIpServidor(String ipServidor) {
		this.ipServidor = ipServidor;
	}

	public BigDecimal getNivelDolor() {
		return this.nivelDolor;
	}

	public void setNivelDolor(BigDecimal nivelDolor) {
		this.nivelDolor = nivelDolor;
	}

	public String getPresentaSomnolencia() {
		return this.presentaSomnolencia;
	}

	public void setPresentaSomnolencia(String presentaSomnolencia) {
		this.presentaSomnolencia = presentaSomnolencia;
	}

	public List<Diagnostico> getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public Diagnostico addDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().add(diagnostico);
		diagnostico.setEpisodio(this);

		return diagnostico;
	}

	public Diagnostico removeDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().remove(diagnostico);
		diagnostico.setEpisodio(null);

		return diagnostico;
	}

	public AcividadFisica getAcividadFisica() {
		return this.acividadFisica;
	}

	public void setAcividadFisica(AcividadFisica acividadFisica) {
		this.acividadFisica = acividadFisica;
	}

	public LocalizacionDolor getLocalizacionDolor() {
		return this.localizacionDolor;
	}

	public void setLocalizacionDolor(LocalizacionDolor localizacionDolor) {
		this.localizacionDolor = localizacionDolor;
	}

	public Medicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public RolUsuario getRolUsuario() {
		return this.rolUsuario;
	}

	public void setRolUsuario(RolUsuario rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

}