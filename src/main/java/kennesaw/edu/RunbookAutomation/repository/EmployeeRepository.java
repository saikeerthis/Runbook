package kennesaw.edu.RunbookAutomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kennesaw.edu.RunbookAutomation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
