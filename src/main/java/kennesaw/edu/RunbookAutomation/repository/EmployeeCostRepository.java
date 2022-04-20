package kennesaw.edu.RunbookAutomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.EmployeeCost;

@Repository
public interface EmployeeCostRepository extends JpaRepository<EmployeeCost, Long> {

}