/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "odontologists")
public class Odontologist {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String dni;

	private String name_surname;

	private String phone_number;

	private String email;

	private String speciality;

	private int medical_license_no;

	@OneToMany
	@JoinColumn(name = "FK_visit_odontologist")
	private List<Visit> visit;

	// Constructors
	public Odontologist() {
	}

	public Odontologist(Long id, String dni, String name_surname, String phone_number, String email, String speciality,
			int medical_license_no) {
		this.id = id;
		this.dni = dni;
		this.name_surname = name_surname;
		this.phone_number = phone_number;
		this.email = email;
		this.speciality = speciality;
		this.medical_license_no = medical_license_no;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getName_surname() {
		return name_surname;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getEmail() {
		return email;
	}

	public String getSpeciality() {
		return speciality;
	}

	public int getMedical_license_no() {
		return medical_license_no;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Visit")
	public List<Visit> getVisit() {
		return visit;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public void setMedical_license_no(int medical_license_no) {
		this.medical_license_no = medical_license_no;
	}

	public void setVisit(List<Visit> visit) {
		this.visit = visit;
	}

}
