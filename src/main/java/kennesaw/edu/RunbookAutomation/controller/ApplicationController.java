package kennesaw.edu.RunbookAutomation.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kennesaw.edu.RunbookAutomation.model.AccessManagement;
import kennesaw.edu.RunbookAutomation.model.RunBook;
import kennesaw.edu.RunbookAutomation.repository.RunbookRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@Autowired
	RunbookRepository runbookRepository;
	
	
	@RequestMapping("/home")
	public String returnReponse() {
		return "pnireesh" ;
	 }
	
	@PostMapping("/create")
	public RunBook createRunbook(@RequestBody RunBook runbook) {
		return runbookRepository.save(runbook);
	}
	
	
//	 @RequestMapping("/username")	 
//	 public String currentUserName(Principal principal) {
//		 System.out.println("Authenticated User : " +principal.getName()); 
//		  return principal.getName();
//		// return "pnireesh" ;
//	 }
	 
	
}