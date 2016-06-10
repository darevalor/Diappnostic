/**
 * 
 */
package edu.uniandes.diappnostic.servicios;

import javax.ejb.Local;

import edu.uniandes.diappnostic.dto.Episodio;

/**
 * @author 80221940
 *
 */
@Local
public interface IServicioGestor {
	
	void registrarEpisodio(Episodio episodio);

}
