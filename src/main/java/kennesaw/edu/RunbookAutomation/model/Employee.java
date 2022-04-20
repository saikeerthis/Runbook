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
@Table(name = "Employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String username;
	@NotBlank
	private String emailAddress;
	@NotBlank
	private String jobTitle;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String department;
	@NotBlank
    private String address;
	@NotBlank
    private String city;
	@NotBlank
    private String country;
	@NotBlank
    private String zip;
	@NotBlank
    private String reporting_manager;    
    private String direct_reports;
    
	private String laptopAsset;
	private String license1;
	private String license2;
	private String license3;
	
	
	public String getLaptopAsset() {
		return laptopAsset;
	}
	public void setLaptopAsset(String laptopAsset) {
		this.laptopAsset = laptopAsset;
	}
	public String getLicense1() {
		return license1;
	}
	public void setLicense1(String license1) {
		this.license1 = license1;
	}
	public String getLicense2() {
		return license2;
	}
	public void setLicense2(String license2) {
		this.license2 = license2;
	}
	public String getLicense3() {
		return license3;
	}
	public void setLicense3(String license3) {
		this.license3 = license3;
	}

	
    
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getReporting_manager() {
		return reporting_manager;
	}
	public void setReporting_manager(String reporting_manager) {
		this.reporting_manager = reporting_manager;
	}
	public String getDirect_reports() {
		return direct_reports;
	}
	public void setDirect_reports(String direct_reports) {
		this.direct_reports = direct_reports;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
