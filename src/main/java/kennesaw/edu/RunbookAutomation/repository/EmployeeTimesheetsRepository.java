package kennesaw.edu.RunbookAutomation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kennesaw.edu.RunbookAutomation.model.AccessManagement;
import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.EmployeeCost;
import kennesaw.edu.RunbookAutomation.model.EmployeeTimesheets;

@Repository
public interface EmployeeTimesheetsRepository extends JpaRepository<EmployeeTimesheets, Long> {


	@Query(value = "SELECT * FROM EMPLOYEE_TIMESHEETS WHERE USERNAME = ?1 ORDER BY ID ASC", nativeQuery = true)
    public List<EmployeeTimesheets> getEmployeeTimesheet(String username);
	
}