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

import C4_EX2.dto.Odontologist;
import C4_EX2.dto.Visit;
import C4_EX2.service.OdontologistService;
import C4_EX2.service.VisitService;

@RestController // Rest controller
@RequestMapping("/api")
public class OdontologistController {

	// Implement service
	@Autowired
	OdontologistService odontologistService;

	// Implement visit service
	@Autowired
	VisitService visitService;

	// Get Mappings
	@GetMapping("/odontologists")
	public List<Odontologist> listOdontologists() {
		return odontologistService.listOdontologists();
	}

	@GetMapping("/odontologists/{id}")
	public Odontologist odontologistById(@PathVariable(name = "id") Long id) {
		Odontologist odontologistxID = new Odontologist();

		odontologistxID = odontologistService.odontologistById(id);

		return odontologistxID;
	}

	// Get list of visits for odontologist
	@GetMapping("/odontologists/{odontologistId}/visits")
	public List<Visit> listVisitsByOdontologistId(@PathVariable(name = "odontologistId") Long odontologistId) {
		return visitService.listVisitsByOdontologistId(odontologistId);

	}

	// Post Mappings
	@PostMapping("/odontologists")
	public Odontologist saveOdontologist(@RequestBody Odontologist odontologist) {
		return odontologistService.saveOdontologist(odontologist);
	}

	// Put Mappings
	@PutMapping("/odontologists/{id}")
	public Odontologist updateOdontologist(@PathVariable(name = "id") Long id, @RequestBody Odontologist odontologist) {
		Odontologist selectedOdontologist = new Odontologist(id, odontologist.getDni(), odontologist.getName_surname(),
				odontologist.getPhone_number(), odontologist.getEmail(), odontologist.getSpeciality(),
				odontologist.getMedical_license_no());
		Odontologist updatedOdontologist = new Odontologist();

		updatedOdontologist = odontologistService.updateOdontologist(selectedOdontologist);
		return updatedOdontologist;
	}

	// Delete Mappings
	@DeleteMapping("/odontologists/{id}")
	public void deleteOdontologist(@PathVariable(name = "id") Long id) {
		odontologistService.deleteOdontologist(id);
	}

}
