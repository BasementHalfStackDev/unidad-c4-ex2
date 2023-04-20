/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import C4_EX2.dto.Visit;
import C4_EX2.service.VisitService;

@RestController // Rest controller
@RequestMapping("/api")
public class VisitController {
	// Implement service
	@Autowired
	VisitService visitService;

	// Get Mappings
	@GetMapping("/visits")
	public List<Visit> listVisits() {
		return visitService.listVisits();
	}

	@GetMapping("/visits/{id}")
	public Visit visitById(@PathVariable(name = "id") Long id) {
		Visit visitxID = new Visit();

		visitxID = visitService.visitById(id);

		return visitxID;
	}

	@GetMapping("/visits/clients/{clientId}")
	public List<Visit> listPartiesByUserId(@PathVariable(name = "clientId") Long clientId) {
		return visitService.listVisitsByClientId(clientId);
	}

	@GetMapping("/visits/odontologists/{odontologistId}")
	public List<Visit> listUsersByPartyId(@PathVariable(name = "odontologistId") Long odontologistId) {
		return visitService.listVisitsByOdontologistId(odontologistId);
	}

	// Post Mappings
	@PostMapping("/visits")
	public Visit saveVisit(@RequestBody Visit visit) {
		return visitService.saveVisit(visit);
	}

	// Put Mappings
	@PutMapping("/visits/{id}")
	public Visit updateVisit(@PathVariable(name = "id") Long id, @RequestBody Visit visit) {
		Visit selectedVisit = new Visit(id, visit.getClient(), visit.getOdontologist(), visit.getProcedure_type(),
				visit.getScheduled(), visit.getPrice());
		Visit updatedVisit = new Visit();

		updatedVisit = visitService.updateVisit(selectedVisit);
		return updatedVisit;
	}

	// Delete Mappings
	@DeleteMapping("/visits/{id}")
	public void deleteVisit(@PathVariable(name = "id") Long id) {
		visitService.deleteVisit(id);
	}
}
