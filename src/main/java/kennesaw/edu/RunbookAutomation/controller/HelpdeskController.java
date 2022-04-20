
package kennesaw.edu.RunbookAutomation.controller;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kennesaw.edu.RunbookAutomation.model.Helpdesk;
import kennesaw.edu.RunbookAutomation.repository.HelpdeskRepository;
  
  @CrossOrigin(origins = "*")
  @RestController
  @RequestMapping("/helpdesk")
  public class HelpdeskController {
  
  @Autowired HelpdeskRepository helpdeskRepository;
  

	@PostMapping("/create")
	public Helpdesk createHelpdeskRequest(@RequestBody Helpdesk helpdesk) {
		return helpdeskRepository.save(helpdesk);
	}
  
  }
  