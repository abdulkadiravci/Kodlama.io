package recapKodlamaIO;

public class UserManager{
	public void add(User user) {
		System.out.println(user.getId());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail() + " kullanýcý kaydedildi.");
	}
}
