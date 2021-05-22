package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.Users;

public class HibernateUserDao implements UserDao{
	
	
	List<Users> users = new ArrayList<Users>();
	@Override
	public void add(Users user) {
		System.out.println(" Hibernate with added. " + user.getFirstName() );
		users.add(user);
	}

	@Override
	public void update(Users user) {
		System.out.println(" Hibernate with updated. " + user.getFirstName() );
		users.add(user);
		
	}

	@Override
	public void delete(Users user) {
		System.out.println(" Hibernate with deleted. " + user.getFirstName() );
		users.add(user);
		
	}

	@Override
	public Users getUsers(String email, String password) {
		
		
		Users loginUsers = null;
		for(Users user:users)
		{
			if (user.geteMail() == email && user.getPassword() == password) {
				loginUsers = user;
			}
		}
		return loginUsers;
	}

	@Override
	public boolean geteMail(String eMail) {
		return false;
	}

	@Override
	public List<Users> getAllUsers() {
		return null;
	}

}
