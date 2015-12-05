package ro.pub.cs.aipi.lab07.businesslogic;

import ro.pub.cs.aipi.lab07.entities.User;

public class UserManager extends PersistentEntityManager<User> {

	public UserManager() {
		super(User.class);
	}

}
