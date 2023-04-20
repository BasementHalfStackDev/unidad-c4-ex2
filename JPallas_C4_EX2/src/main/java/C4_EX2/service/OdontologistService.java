/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import C4_EX2.dao.OdontologistDAO;
import C4_EX2.dto.Odontologist;

@Service // Assign Service
public class OdontologistService {

	// Load DAO
	@Autowired
	OdontologistDAO odontologistDAO;

	// CRUD functions
	public List<Odontologist> listOdontologists() {
		return odontologistDAO.findAll();
	}

	public Odontologist saveOdontologist(Odontologist odontologist) {
		return odontologistDAO.save(odontologist);
	}

	public Odontologist odontologistById(Long id) {
		return odontologistDAO.findById(id).get();
	}

	public Odontologist updateOdontologist(Odontologist odontologist) {
		return odontologistDAO.save(odontologist);
	}

	public void deleteOdontologist(Long id) {
		odontologistDAO.deleteById(id);
	}

}
