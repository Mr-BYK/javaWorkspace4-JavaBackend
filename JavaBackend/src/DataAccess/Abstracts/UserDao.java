package DataAccess.Abstracts;

import Entities.Concretes.Users;
import java.util.List;

public interface UserDao {

	void add(Users user);
	void update(Users user);
	void delete(Users user);
	Users getUsers(String email,String password);
	boolean geteMail(String eMail);
	List<Users> getAllUsers();

}
