/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import C4_EX2.dao.ClientDAO;
import C4_EX2.dto.Client;

@Service // Assign Service
public class ClientService {

	// Load DAO
	@Autowired
	ClientDAO clientDAO;

	// CRUD functions
	public List<Client> listClients() {
		return clientDAO.findAll();
	}

	public Client saveClient(Client client) {
		return clientDAO.save(client);
	}

	public Client clientById(Long id) {
		return clientDAO.findById(id).get();
	}

	public Client updateClient(Client client) {
		return clientDAO.save(client);
	}

	public void deleteClient(Long id) {
		clientDAO.deleteById(id);
	}

}
