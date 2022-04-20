package kennesaw.edu.RunbookAutomation.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "Employee_Cost")
@EntityListeners(AuditingEntityListener.class)
public class EmployeeCost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String username;
	@NotBlank
	private String jobTitle;
	@NotBlank
	private String experience;
	@NotBlank
	private String salary;
	@NotBlank
    private String assests;
	@NotBlank
    private String licenses;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAssests() {
		return assests;
	}
	public void setAssests(String assests) {
		this.assests = assests;
	}
	public String getLicenses() {
		return licenses;
	}
	public void setLicenses(String licenses) {
		this.licenses = licenses;
	}
}
