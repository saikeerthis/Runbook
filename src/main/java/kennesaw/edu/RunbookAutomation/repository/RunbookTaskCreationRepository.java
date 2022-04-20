package kennesaw.edu.RunbookAutomation.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import kennesaw.edu.RunbookAutomation.model.RunbookTaskCreation;

@Repository
public interface RunbookTaskCreationRepository extends JpaRepository<RunbookTaskCreation, Long> {
	
	@Query(value = "SELECT * FROM RUNBOOK_TASKS WHERE RUNBOOK_NAME = ?1", nativeQuery = true)
    public List<RunbookTaskCreation> getRunbookTasks(String runbookname);
	
	
}

