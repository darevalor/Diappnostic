/**
 * 
 */
package edu.uniandes.diappnostic.serviciosImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import edu.uniandes.diappnostic.dto.Episodio;
import edu.uniandes.diappnostic.servicios.IServicioGestor;

/**
 * @author 80221940
 *
 */
@Stateless
public class ServicioGestor implements IServicioGestor {

	/**
	 * registra un episodio en el sistema
	 * @param episodio informacion del episodio
	 */
	@Override
	public void registrarEpisodio(Episodio episodio) {
		System.out.print("OK: " + episodio.getConsecutivo());
		
	}

	/**
	 * Revisar los episodios de dolor del paciente 
	 * a partir de su no. de identificación.
	 * @param identificacion id del paciente
	 * @return episodio del paciente
	 */
	@Override
	public List<Episodio> consultarEpisodios(int identificacion) {
		System.out.print("OK: " + identificacion);
		
		List<Episodio> lista = new ArrayList<Episodio>();
		Episodio ep1 = new Episodio(11, "2016/01/10", 5, "N", "muchos", "me duele", 
				2, 3, 4, identificacion, 2);
		Episodio ep2 = new Episodio(22, "2016/06/10", 5, "S", "poco", "mensaje voz", 
				66, 32, 409, identificacion, 5);
		
		lista.add(ep1);
		lista.add(ep2);
		
		return lista;
	}

	
	
}
