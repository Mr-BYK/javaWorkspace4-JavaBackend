package Business.Abstracts;

import Entities.Concretes.Users;
import java.util.List;
import Core.Abstacts.SignUpService;


public interface UserService {
	void signUp(Users user);
	void signUpWithAnotherService(String eMail, String password, SignUpService signUpService );
	void login(String eMail, String password);
	List<Users> getAll();
}
