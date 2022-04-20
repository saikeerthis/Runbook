package kennesaw.edu.RunbookAutomation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.Helpdesk;
import kennesaw.edu.RunbookAutomation.repository.EmployeeRepository;
import kennesaw.edu.RunbookAutomation.repository.HelpdeskRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	HelpdeskRepository helpdeskRepository;
	
//	@Autowired
//	EmployeeAssetRepository employeeAssetRepository;
//	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
//	@PostMapping("/asset/create")
//	public EmployeeAsset createEmployeeAsset(@RequestBody EmployeeAsset employeeAsset) {
//		return employeeAssetRepository.save(employeeAsset);
//	}
	
	@RequestMapping(path="/getUsers", produces="application/json")
    @ResponseBody
    public List<Employee> viewAllItems() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }
	
//
//	@PostMapping("/helpdesk/create")
//	public Helpdesk createHelpdeskRequest(@RequestBody Helpdesk helpdesk) {
//		return helpdeskRepository.save(helpdesk);
//	}
	
}
