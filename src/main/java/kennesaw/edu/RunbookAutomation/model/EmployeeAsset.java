//package kennesaw.edu.RunbookAutomation.model;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//@Entity
//@Table(name = "Employee_Asset")
//@EntityListeners(AuditingEntityListener.class)
//public class EmployeeAsset {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@NotBlank
//	private String username;
//	@NotBlank
//	private String laptopAsset;
//	@NotBlank
//	private String license1;
//	@NotBlank
//	private String license2;
//	@NotBlank
//	private String license3;
//	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getLaptopAsset() {
//		return laptopAsset;
//	}
//	public void setLaptopAsset(String laptopAsset) {
//		this.laptopAsset = laptopAsset;
//	}
//	public String getLicense1() {
//		return license1;
//	}
//	public void setLicense1(String license1) {
//		this.license1 = license1;
//	}
//	public String getLicense2() {
//		return license2;
//	}
//	public void setLicense2(String license2) {
//		this.license2 = license2;
//	}
//	public String getLicense3() {
//		return license3;
//	}
//	public void setLicense3(String license3) {
//		this.license3 = license3;
//	}
//}
