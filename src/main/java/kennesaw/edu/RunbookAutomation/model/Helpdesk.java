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
@Table(name = "Helpdesk")
@EntityListeners(AuditingEntityListener.class)
public class Helpdesk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String username;
	@NotBlank
	private String emailAddress;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String severity;
	@NotBlank
    private String databaseAccessRights;
	public String getDatabaseAccessRights() {
		return databaseAccessRights;
	}
	public void setDatabaseAccessRights(String databaseAccessRights) {
		this.databaseAccessRights = databaseAccessRights;
	}
	@NotBlank
    private String linuxServers;
	@NotBlank
    private String softwareInstallation;
	@NotBlank
    private String description;

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
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getLinuxServers() {
		return linuxServers;
	}
	public void setLinuxServers(String linuxServers) {
		this.linuxServers = linuxServers;
	}
	public String getSoftwareInstallation() {
		return softwareInstallation;
	}
	public void setSoftwareInstallation(String softwareInstallation) {
		this.softwareInstallation = softwareInstallation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
