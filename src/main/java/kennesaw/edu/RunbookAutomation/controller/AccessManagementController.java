package kennesaw.edu.RunbookAutomation.controller;

import java.security.Principal;
import java.util.List;

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
import kennesaw.edu.RunbookAutomation.model.EmployeePerformance;
import kennesaw.edu.RunbookAutomation.model.EmployeeTimesheets;
import kennesaw.edu.RunbookAutomation.repository.AccessManagementRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AccessManagementController {
	
	@Autowired
	AccessManagementRepository accessManagementRepository;
	
	@RequestMapping(path="/getUserAccess", produces="application/json")
    @ResponseBody
    public List<AccessManagement> getUserAccess() {
        List<AccessManagement> useraccess = accessManagementRepository.findAll();
        return useraccess;
    }
	
	@GetMapping("/getaccess/{username}")
	public List<AccessManagement> getHintPracticeQuestionbyId(@PathVariable(value = "username") String username) {
		return accessManagementRepository.getUserProfile(username);	
	}
	
	@PutMapping("/getUserAccess/reject/{id}")
    public ResponseEntity<AccessManagement>  rejectTimesheets(@PathVariable(value = "id") Long employeeId) 
    throws ResourceNotFoundException {
		
        AccessManagement employeeTimesheets = accessManagementRepository.findById(employeeId)
        		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeTimesheets.setStatus("Rejected");
        final AccessManagement updatedEmployee = accessManagementRepository.save(employeeTimesheets);
        return ResponseEntity.ok(updatedEmployee);
    }
	
	
	@PutMapping("/getUserAccess/approve/{id}")
    public ResponseEntity<AccessManagement>  updateTimesheets(@PathVariable(value = "id") Long employeeId
    		// @PathVariable(value = "status") String status,
    		// @Valid @RequestBody EmployeeTimesheets employeeDetails
    		                                                    ) 
    throws ResourceNotFoundException {
		
		AccessManagement employeeTimesheets = accessManagementRepository.findById(employeeId)
        		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        employeeTimesheets.setStatus("Approved");
        final AccessManagement updatedEmployee = accessManagementRepository.save(employeeTimesheets);
        return ResponseEntity.ok(updatedEmployee);
    }

	
	
}