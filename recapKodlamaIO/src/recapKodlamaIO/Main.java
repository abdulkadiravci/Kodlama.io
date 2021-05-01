package recapKodlamaIO;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Kadir","Avc�","kadiravci2731@gmail.com","12436656");
		
		Student student1 = new Student("Kadir","Avc�","198104007","Java");
		Student student2 = new Student("�mer", "Avc�", "198104008", "Java+React");
		
		Instructor instructor1 = new Instructor("Engin", "Demiro�", "engindemirog@gmail.com", "Java");
		
		User[] users = {
				user1,
				student1,
				student2,
				instructor1
		};
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(student1);
		studentManager.registerCourse(student2);
	
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
	}

}