package edu.uniandes.diappnostic.serviciosImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import edu.uniandes.diappnostic.dto.EpisodioDto;
import edu.uniandes.diappnostic.entities.Episodio;
import edu.uniandes.diappnostic.servicios.IServicioGestor;

/**
 * @author 80221940
 *
 */
@Stateless
public class ServicioGestor implements IServicioGestor {
	
	/**
	 * 
	 */
	@PersistenceContext(unitName = "DiappnosticWS-ejb")
	private EntityManager em;
	

	/**
	 * registra un episodio en el sistema
	 * @param episodio informacion del episodio
	 */
	@Override
	public void registrarEpisodio(EpisodioDto episodioDto) {
		System.out.print("OK: " + episodioDto.getNumDocUsuario());
		
		Query query = em.createNativeQuery("INSERT INTO EPISODIO VALUES (SEQ_EPISODIO.NEXTVAL, to_date(?1, 'dd/mm/yyyy'), ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)");
		query.setParameter(1, episodioDto.getFecha());
		query.setParameter(2, episodioDto.getNivelDolor());
		query.setParameter(3, episodioDto.getPresentaSomnolencia());
		query.setParameter(4, episodioDto.getAlimentosConsumidos());
		query.setParameter(5, episodioDto.getDescripcionVoz());
		query.setParameter(6, episodioDto.getMedicamento());
		query.setParameter(7, episodioDto.getAcividadFisica());
		query.setParameter(8, episodioDto.getLocalizacionDolor());
		query.setParameter(9, episodioDto.getNumDocUsuario());
		query.setParameter(10, episodioDto.getCodRolUsuario());
		
		query.executeUpdate();
		em.flush();

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
		
		
		
		
		
//		Episodio ep1 = new Episodio(11, "2016/01/10", 5, "N", "muchos", "me duele", 
//				2, 3, 4, identificacion, 2);
//		Episodio ep2 = new Episodio(22, "2016/06/10", 5, "S", "poco", "mensaje voz", 
//				66, 32, 409, identificacion, 5);
		
//		lista.add(ep1);
//		lista.add(ep2);
		
		return lista;
	}

	
	
}
