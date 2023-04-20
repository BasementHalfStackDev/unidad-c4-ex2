/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import C4_EX2.dao.VisitDAO;
import C4_EX2.dto.Visit;

@Service // Assign Service
public class VisitService {

	// Load DAO
	@Autowired
	VisitDAO visitDAO;

	// CRUD functions
	public List<Visit> listVisits() {
		return visitDAO.findAll();
	}

	public List<Visit> listVisitsByClientId(Long clientId) {
		return visitDAO.findVisitsByClientId(clientId);
	}

	public List<Visit> listVisitsByOdontologistId(Long odontologistId) {
		return visitDAO.findVisitsByOdontologistId(odontologistId);
	}

	public Visit saveVisit(Visit visit) {
		return visitDAO.save(visit);
	}

	public Visit visitById(Long id) {
		return visitDAO.findById(id).get();
	}

	public Visit updateVisit(Visit visit) {
		return visitDAO.save(visit);
	}

	public void deleteVisit(Long id) {
		visitDAO.deleteById(id);
	}

}
