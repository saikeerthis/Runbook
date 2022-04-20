package kennesaw.edu.RunbookAutomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.EmployeeCost;
import kennesaw.edu.RunbookAutomation.model.EmployeePerformance;

@Repository
public interface EmployeePerformanceRepository extends JpaRepository<EmployeePerformance, Long> {

}