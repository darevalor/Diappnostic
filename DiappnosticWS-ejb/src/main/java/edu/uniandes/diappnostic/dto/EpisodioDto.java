/**
 * 
 */
package edu.uniandes.diappnostic.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 80221940
 *
 */
public class EpisodioDto  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String alimentosConsumidos;
	
	private String descripcionVoz;
			
	private String fecha;
	
	private int nivelDolor;
	
	private String presentaSomnolencia;
	
	private int acividadFisica;
	
	private int localizacionDolor;
		
	private int medicamento;
		
	private int numDocUsuario;
	
	private int codRolUsuario;
	
	

	/**
	 * @param alimentosConsumidos
	 * @param descripcionVoz
	 * @param fecha
	 * @param nivelDolor
	 * @param presentaSomnolencia
	 * @param acividadFisica
	 * @param localizacionDolor
	 * @param medicamento
	 * @param numDocUsuario
	 * @param codRolUsuario
	 */
	public EpisodioDto(String alimentosConsumidos, String descripcionVoz,
			String fecha, int nivelDolor, String presentaSomnolencia,
			int acividadFisica, int localizacionDolor, int medicamento,
			int numDocUsuario, int codRolUsuario) {
		this.alimentosConsumidos = alimentosConsumidos;
		this.descripcionVoz = descripcionVoz;
		this.fecha = fecha;
		this.nivelDolor = nivelDolor;
		this.presentaSomnolencia = presentaSomnolencia;
		this.acividadFisica = acividadFisica;
		this.localizacionDolor = localizacionDolor;
		this.medicamento = medicamento;
		this.numDocUsuario = numDocUsuario;
		this.codRolUsuario = codRolUsuario;
	}

	/**
	 * @return the alimentosConsumidos
	 */
	public String getAlimentosConsumidos() {
		return alimentosConsumidos;
	}

	/**
	 * @param alimentosConsumidos the alimentosConsumidos to set
	 */
	public void setAlimentosConsumidos(String alimentosConsumidos) {
		this.alimentosConsumidos = alimentosConsumidos;
	}

	/**
	 * @return the descripcionVoz
	 */
	public String getDescripcionVoz() {
		return descripcionVoz;
	}

	/**
	 * @param descripcionVoz the descripcionVoz to set
	 */
	public void setDescripcionVoz(String descripcionVoz) {
		this.descripcionVoz = descripcionVoz;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the nivelDolor
	 */
	public int getNivelDolor() {
		return nivelDolor;
	}

	/**
	 * @param nivelDolor the nivelDolor to set
	 */
	public void setNivelDolor(int nivelDolor) {
		this.nivelDolor = nivelDolor;
	}

	/**
	 * @return the presentaSomnolencia
	 */
	public String getPresentaSomnolencia() {
		return presentaSomnolencia;
	}

	/**
	 * @param presentaSomnolencia the presentaSomnolencia to set
	 */
	public void setPresentaSomnolencia(String presentaSomnolencia) {
		this.presentaSomnolencia = presentaSomnolencia;
	}

	/**
	 * @return the acividadFisica
	 */
	public int getAcividadFisica() {
		return acividadFisica;
	}

	/**
	 * @param acividadFisica the acividadFisica to set
	 */
	public void setAcividadFisica(int acividadFisica) {
		this.acividadFisica = acividadFisica;
	}

	/**
	 * @return the localizacionDolor
	 */
	public int getLocalizacionDolor() {
		return localizacionDolor;
	}

	/**
	 * @param localizacionDolor the localizacionDolor to set
	 */
	public void setLocalizacionDolor(int localizacionDolor) {
		this.localizacionDolor = localizacionDolor;
	}

	/**
	 * @return the medicamento
	 */
	public int getMedicamento() {
		return medicamento;
	}

	/**
	 * @param medicamento the medicamento to set
	 */
	public void setMedicamento(int medicamento) {
		this.medicamento = medicamento;
	}

	/**
	 * @return the numDocUsuario
	 */
	public int getNumDocUsuario() {
		return numDocUsuario;
	}

	/**
	 * @param numDocUsuario the numDocUsuario to set
	 */
	public void setNumDocUsuario(int numDocUsuario) {
		this.numDocUsuario = numDocUsuario;
	}

	/**
	 * @return the codRolUsuario
	 */
	public int getCodRolUsuario() {
		return codRolUsuario;
	}

	/**
	 * @param codRolUsuario the codRolUsuario to set
	 */
	public void setCodRolUsuario(int codRolUsuario) {
		this.codRolUsuario = codRolUsuario;
	}
	
	
	
	
}
