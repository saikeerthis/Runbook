package kennesaw.edu.RunbookAutomation.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kennesaw.edu.RunbookAutomation.model.Employee;
import kennesaw.edu.RunbookAutomation.model.EmployeeTimesheets;
import kennesaw.edu.RunbookAutomation.model.RunBook;
import kennesaw.edu.RunbookAutomation.model.RunbookTaskCreation;
import kennesaw.edu.RunbookAutomation.repository.RunbookRepository;
import kennesaw.edu.RunbookAutomation.repository.RunbookTaskCreationRepository;
  
  @CrossOrigin(origins = "*")
  @RestController
  @RequestMapping("/runbooktask")
  public class RunbookTaskCreationController {
  
  @Autowired
  RunbookTaskCreationRepository runbookRepository;
  
  @Autowired
  RunbookRepository runRepository;
  
  @PostMapping("/create")
  public RunbookTaskCreation createRunbookTasks(@RequestBody RunbookTaskCreation runbookTaskCreation) {
		return runbookRepository.save(runbookTaskCreation);
	}

  @RequestMapping(path="/getrunbooks", produces="application/json")
  @ResponseBody
  public List<RunBook> getRunbooks() {
      List<RunBook> runbooks = runRepository.findAll();
      return runbooks;
  }
  
 
  
  @GetMapping(path="/getrunbookTasks/{runbookname}")
  public List<RunbookTaskCreation> viewAllItems(@PathVariable(value = "runbookname") String runbookname) {
      List<RunbookTaskCreation> allRunbooks = runbookRepository.getRunbookTasks(runbookname);
      return allRunbooks;
  }
  
  
	/*
	 * @RequestMapping(path="/getrunbookTasks/{runbookname}"", produces="application
	 * /json")
	 * 
	 * @ResponseBody public List<RunbookTaskCreation> viewAllItems() {
	 * List<RunbookTaskCreation> allRunbooks = runbookRepository.findAll(); return
	 * allRunbooks; }
	 */
  
}