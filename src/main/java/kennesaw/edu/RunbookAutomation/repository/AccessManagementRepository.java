package kennesaw.edu.RunbookAutomation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import kennesaw.edu.RunbookAutomation.model.AccessManagement;

@Repository
public interface AccessManagementRepository extends JpaRepository<AccessManagement, Long> {

	@Query(value = "SELECT * FROM ACCESS_MANAGEMENT WHERE USERNAME = ?1 ORDER BY ID ASC", nativeQuery = true)
    public List<AccessManagement> getUserProfile(String username);
	
	
}