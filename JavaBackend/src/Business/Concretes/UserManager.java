package Business.Concretes;

import java.util.List;

import Business.Abstracts.UserService;
import Core.Abstacts.SignUpService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.Users;

public class UserManager  implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	AuthManager authManager = new AuthManager();
	
	
	//Regex
	public static final String regex = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public void signUp(Users user) {
		if(authManager.userIsValid(user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassword()));
		{
			userDao.add(user);
			authManager.sendConfirmMail();
		}
	}

	@Override
	public void signUpWithAnotherService(String eMail, String password, SignUpService signUpService) {
		signUpService.SignUpWithAnotherAccount(eMail, password);
		authManager.sendConfirmMail();
		
	}

	@Override
	public void login(String eMail, String password) {
		if(userDao.getUsers(eMail, password) != null) {
			System.out.println("Login successful.");
		}
		else {
			System.out.println("Login failed.");
		}
		
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
