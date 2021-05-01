package recapKodlamaIO;

public class Student extends User{
	private String firstName;
	private String lastName;
	private String studentNumber;
	private String hangiEgitim;
	
	public Student(String firstName, String lastName, String studentNumber,String hangiEgitim) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.hangiEgitim = hangiEgitim;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getHangiEgitim() {
		return hangiEgitim;
	}
	public void setHangiEgitim(String hangiEgitim) {
		this.hangiEgitim = hangiEgitim;
	}
}
