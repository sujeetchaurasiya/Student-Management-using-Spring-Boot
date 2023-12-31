package in.com.student.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="student_table")

public class Studententity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	
	private  int id;
	
	@Column
	
	private String fname;
	@Column
	//@NotNull(message="Empty Field !")
	private String city;
	@Column
	
	private String email;
	@Column
	
	private String mnum;
	@Column
	
	private String course;
	
	
	public Studententity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Studententity(int id, String fname, String city, String email, String mnum, String course) {
		super();
		this.id = id;
		this.fname = fname;
		this.city = city;
		this.email = email;
		this.mnum = mnum;
		this.course = course;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
