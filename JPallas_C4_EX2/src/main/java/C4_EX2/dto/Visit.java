/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "visits")
public class Visit {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "odontologist_id")
	private Odontologist odontologist;

	private String procedure_type;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime scheduled;

	private double price;

	// Constructors
	public Visit() {
	}

	public Visit(Long id, Client client, Odontologist odontologist, String procedure_type, LocalDateTime scheduled,
			double price) {
		this.id = id;
		this.client = client;
		this.odontologist = odontologist;
		this.procedure_type = procedure_type;
		this.scheduled = scheduled;
		this.price = price;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Client getClient() {
		return client;
	}

	public Odontologist getOdontologist() {
		return odontologist;
	}

	public String getProcedure_type() {
		return procedure_type;
	}

	public LocalDateTime getScheduled() {
		return scheduled;
	}

	public double getPrice() {
		return price;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setOdontologist(Odontologist odontologist) {
		this.odontologist = odontologist;
	}

	public void setProcedure_type(String procedure_type) {
		this.procedure_type = procedure_type;
	}

	public void setScheduled(LocalDateTime scheduled) {
		this.scheduled = scheduled;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
