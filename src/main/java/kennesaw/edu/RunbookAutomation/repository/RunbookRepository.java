package kennesaw.edu.RunbookAutomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kennesaw.edu.RunbookAutomation.model.RunBook;

@Repository
public interface RunbookRepository extends JpaRepository<RunBook, Long> {
}