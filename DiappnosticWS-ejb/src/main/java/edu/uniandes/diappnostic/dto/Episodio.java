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
public class Episodio  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int consecutivo;
	
	private String fecha;
	
	private int nivelDolor;
	
	private String presentaSomnolencia;
	
	private String alimentosConsumidos;
	
	private String descripcionVoz;
	
	private int codMedicamento;
	
	private int codActividad;
	
	private int codLocDolor;
	
	private int numDocUsuario;
	
	private int codRolUsuario;
	
	
	
	/**
	 * 
	 * @param consecutivo
	 * @param fecha
	 * @param nivelDolor
	 * @param presentaSomnolencia
	 * @param alimentosConsumidos
	 * @param descripcionVoz
	 * @param codMedicamento
	 * @param codActividad
	 * @param codLocDolor
	 * @param numDocUsuario
	 * @param codRolUsuario
	 */
	public Episodio(int consecutivo, String fecha, int nivelDolor, String presentaSomnolencia, String alimentosConsumidos,
			String descripcionVoz, int codMedicamento, int codActividad, int codLocDolor, int numDocUsuario,
			int codRolUsuario) {
		super();
		this.consecutivo = consecutivo;
		this.fecha = fecha;
		this.nivelDolor = nivelDolor;
		this.presentaSomnolencia = presentaSomnolencia;
		this.alimentosConsumidos = alimentosConsumidos;
		this.descripcionVoz = descripcionVoz;
		this.codMedicamento = codMedicamento;
		this.codActividad = codActividad;
		this.codLocDolor = codLocDolor;
		this.numDocUsuario = numDocUsuario;
		this.codRolUsuario = codRolUsuario;
	}




	/**
	 * 
	 */
	public Episodio() {
		
	}
	

	

	/**
	 * @return the consecutivo
	 */
	public int getConsecutivo() {
		return consecutivo;
	}




	/**
	 * @param consecutivo the consecutivo to set
	 */
	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
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
	 * @return the codMedicamento
	 */
	public int getCodMedicamento() {
		return codMedicamento;
	}




	/**
	 * @param codMedicamento the codMedicamento to set
	 */
	public void setCodMedicamento(int codMedicamento) {
		this.codMedicamento = codMedicamento;
	}




	/**
	 * @return the codActividad
	 */
	public int getCodActividad() {
		return codActividad;
	}




	/**
	 * @param codActividad the codActividad to set
	 */
	public void setCodActividad(int codActividad) {
		this.codActividad = codActividad;
	}




	/**
	 * @return the codLocDolor
	 */
	public int getCodLocDolor() {
		return codLocDolor;
	}




	/**
	 * @param codLocDolor the codLocDolor to set
	 */
	public void setCodLocDolor(int codLocDolor) {
		this.codLocDolor = codLocDolor;
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
