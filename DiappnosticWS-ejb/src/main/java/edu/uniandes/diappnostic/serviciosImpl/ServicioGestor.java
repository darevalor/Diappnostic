/**
 * 
 */
package edu.uniandes.diappnostic.serviciosImpl;

import javax.ejb.Stateless;

import edu.uniandes.diappnostic.dto.Episodio;
import edu.uniandes.diappnostic.servicios.IServicioGestor;

/**
 * @author 80221940
 *
 */
@Stateless
public class ServicioGestor implements IServicioGestor {

	
	@Override
	public void registrarEpisodio(Episodio episodio) {
		System.out.print("OK: " + episodio.getConsecutivo());
		
	}

	
	
}
