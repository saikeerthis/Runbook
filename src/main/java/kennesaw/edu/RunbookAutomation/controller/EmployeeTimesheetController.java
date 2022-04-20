package kennesaw.edu.RunbookAutomation.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kennesaw.edu.RunbookAutomation.exception.ResourceNotFoundException;
import kennesaw.edu.RunbookAutomation.model.AccessManagement;
import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.EmployeePerformance;
import kennesaw.edu.RunbookAutomation.model.EmployeeTimesheets;
import kennesaw.edu.RunbookAutomation.repository.AccessManagementRepository;
import kennesaw.edu.RunbookAutomation.repository.EmployeeTimesheetsRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EmployeeTimesheetController {

	@Autowired
	EmployeeTimesheetsRepository employeeTimesheetsRepository;
	
	@RequestMapping(path="/getTimesheets", produces="application/json")
    @ResponseBody
    public List<EmployeeTimesheets> viewAllItems() {
        List<EmployeeTimesheets> timesheets = employeeTimesheetsRepository.findAll();
        return timesheets;
    }
	
	@GetMapping("/getTimesheets/{username}")
	public List<EmployeeTimesheets> getEmployeeTimesheets(@PathVariable(value = "username") String username) {
		return employeeTimesheetsRepository.getEmployeeTimesheet(username);	
	}
	
	@PutMapping("/timesheets/reject/{id}")
    public ResponseEntity<EmployeeTimesheets>  rejectTimesheets(@PathVariable(value = "id") Long employeeId) 
    throws ResourceNotFoundException {
		
        EmployeeTimesheets employeeTimesheets = employeeTimesheetsRepository.findById(employeeId)
        		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        System.out.println(employeeTimesheets.getProject() + "-" + employeeTimesheets.getUsername());
        employeeTimesheets.setStatus("Rejected");
        final EmployeeTimesheets updatedEmployee = employeeTimesheetsRepository.save(employeeTimesheets);
        return ResponseEntity.ok(updatedEmployee);
    }
	
	
	@PutMapping("/timesheets/{id}")
    public ResponseEntity<EmployeeTimesheets>  updateTimesheets(@PathVariable(value = "id") Long employeeId
    		// @PathVariable(value = "status") String status,
    		// @Valid @RequestBody EmployeeTimesheets employeeDetails
    		                                                    ) 
    throws ResourceNotFoundException {
		
        EmployeeTimesheets employeeTimesheets = employeeTimesheetsRepository.findById(employeeId)
        		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        System.out.println(employeeTimesheets.getProject() + "-" + employeeTimesheets.getUsername());
        employeeTimesheets.setStatus("Approved");
        final EmployeeTimesheets updatedEmployee = employeeTimesheetsRepository.save(employeeTimesheets);
        return ResponseEntity.ok(updatedEmployee);
    }
}
