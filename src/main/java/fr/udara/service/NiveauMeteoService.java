/**
 * 
 */
package fr.udara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.udara.exception.NotFoundException;
import fr.udara.model.NiveauMeteo;
import fr.udara.repository.NiveauMeteoRepository;

/**
 * @author UDARA
 *
 */
@Service
public class NiveauMeteoService {
	
	private NiveauMeteoRepository niveauMeteoRepository;

	/** Constructeur
	 * 
	 */
	@Autowired
	public NiveauMeteoService(NiveauMeteoRepository niveauMeteoRepository) {
		this.niveauMeteoRepository = niveauMeteoRepository;
	}
	
	
	/**
	 * @param un objet NiveauMeteo sans id
	 * @return l'objet NiveauMeteo avec un id
	 */
	@Transactional
	public NiveauMeteo save(NiveauMeteo niveauMeteo) {
		return niveauMeteoRepository.save(niveauMeteo);
		
	}
	/**
	 * @return une liste d'objet NiveauMeteo
	 */
	public List<NiveauMeteo> findAll() {
		return niveauMeteoRepository.findAll();
	}

	
	/**
	 * @param id d'un objet NiveauMeteo
	 * @return une oéventuelle liste d'objet NiveauMeteo
	 */
	public NiveauMeteo findById(Long id) {
		return niveauMeteoRepository.findById(id).orElseThrow(() -> new NotFoundException());
	}

	
	/**
	 * @param id d'un objet NiveauMeteo
	 * @return true si l'id existe
	 */
	public boolean existsById(Long id) {
		return niveauMeteoRepository.existsById(id);
	}
	
	
	/**
	 * @return le nombre d'objet NiveauMeteo
	 */
	public long count() {
		return niveauMeteoRepository.count();
	}
	
	
	/**
	 * @param id d'un objet NiveauMeteo
	 */
	@Transactional
	public void deleteById(Long id) {
		niveauMeteoRepository.deleteById(id);
	}
	
	
	/**
	 * @param un objet NiveauMeteo
	 */
	@Transactional
	public void delete(NiveauMeteo niveauMeteo) {
		niveauMeteoRepository.delete(niveauMeteo);
	}

}
