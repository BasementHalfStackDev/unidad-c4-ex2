/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package C4_EX2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import C4_EX2.dto.Odontologist;

public interface OdontologistDAO extends JpaRepository<Odontologist, Long> {

}
