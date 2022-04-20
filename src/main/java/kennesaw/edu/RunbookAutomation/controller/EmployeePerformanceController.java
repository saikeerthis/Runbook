package kennesaw.edu.RunbookAutomation.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kennesaw.edu.RunbookAutomation.model.EmployeePerformance;
import kennesaw.edu.RunbookAutomation.repository.EmployeePerformanceRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EmployeePerformanceController {

	@Autowired
	EmployeePerformanceRepository employeePerformanceRepository;
	
	@RequestMapping(path="/getEmployeePerformances", produces="application/json")
    @ResponseBody
    public List<EmployeePerformance> getEmployeePerformance() {
        List<EmployeePerformance> employeePerformances = employeePerformanceRepository.findAll();
        return employeePerformances;
    }
}