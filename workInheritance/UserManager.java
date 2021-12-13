package workInheritance;

public class UserManager {
	public void add(User user) {
		System.out.println("Kayıt işlemi gerçekleşti " + user.getFirstName() +" "+ user.getLastName());

	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
