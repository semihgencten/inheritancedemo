package inheritanceHw;

public class UserManager {
	public void register(User user) {
		System.out.println(user.getFirstName()+" registered");
	}
	public void deleteAccount(User user) {
		System.out.println(user.getFirstName()+" deleted");
	}
	public void sigIn(User user) {
		System.out.println(user.getFirstName()+" signed in");
	}
}
