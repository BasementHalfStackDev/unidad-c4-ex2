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

import C4_EX2.dto.Client;
import C4_EX2.service.ClientService;

@RestController // Rest controller
@RequestMapping("/api")
public class ClientController {

	// Implement service
	@Autowired
	ClientService clientService;

	// Get Mappings
	@GetMapping("/clients")
	public List<Client> listClients() {
		return clientService.listClients();
	}

	@GetMapping("/clients/{id}")
	public Client clientById(@PathVariable(name = "id") Long id) {
		Client clientxID = new Client();

		clientxID = clientService.clientById(id);

		return clientxID;
	}

	// Post Mappings
	@PostMapping("/clients")
	public Client saveClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}

	// Put Mappings
	@PutMapping("/clients/{id}")
	public Client updateClient(@PathVariable(name = "id") Long id, @RequestBody Client client) {
		Client selectedClient = new Client(id, client.getDni(), client.getName_surname(), client.getPhone_number(),
				client.getEmail(), client.getInsurance());
		Client updatedClient = new Client();

		updatedClient = clientService.updateClient(selectedClient);
		return updatedClient;
	}

	// Delete Mappings
	@DeleteMapping("/clients/{id}")
	public void deleteClient(@PathVariable(name = "id") Long id) {
		clientService.deleteClient(id);
	}

}
