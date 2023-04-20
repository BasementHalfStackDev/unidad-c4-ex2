/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import C4_EX2.dto.Visit;

public interface VisitDAO extends JpaRepository<Visit, Long> {

	public List<Visit> findVisitsByClientId(Long clientId);

	public List<Visit> findVisitsByOdontologistId(Long odontologistId);

}
