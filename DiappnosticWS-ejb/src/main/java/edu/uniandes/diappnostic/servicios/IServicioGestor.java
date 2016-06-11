/**
 * 
 */
package edu.uniandes.diappnostic.servicios;

import java.util.List;

import javax.ejb.Local;

import edu.uniandes.diappnostic.dto.Episodio;

/**
 * @author 80221940
 *
 */
@Local
public interface IServicioGestor {
	
	/**
	 * registra un episodio en el sistema
	 * @param episodio informacion del episodio
	 */
	void registrarEpisodio(Episodio episodio);
	
	/**
	 * Revisar los episodios de dolor del paciente 
	 * a partir de su no. de identificación.
	 * @param identificacion id del paciente
	 * @return episodio del paciente
	 */
	List<Episodio> consultarEpisodios(int identificacion);

}
