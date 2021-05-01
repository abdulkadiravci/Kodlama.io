package recapKodlamaIO;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getId());
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getLastName());
		System.out.println(instructor.getEmail());
		System.out.println(instructor.getLessons() + " dersin eðitmenidir.");
	}
}
