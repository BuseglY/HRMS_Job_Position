package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.IEntity;

@Entity
@Table(name="job_seeker")
public class JobSeeker implements IEntity {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="year_of_birth")
	private short yearOfBirth;
	
	@Column(name="e_mail")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="job_position_id")
	private int jobPosition;
	
	public JobSeeker(int id,String firstName, String lastName, String identificationNumber, short yearOfBirth, String email,
			String password, int jobPosition) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.yearOfBirth = yearOfBirth;
		this.email = email;
		this.password = password;
		this.jobPosition = jobPosition;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id){
		this.id=id;
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

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public short getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(short yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(int jobPosition) {
		this.jobPosition = jobPosition;
	}

}
