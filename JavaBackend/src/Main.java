import Business.Concretes.UserManager;


import Core.Concretes.SignUpServiceAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.Users;

public class Main {

	public static void main(String[] args) {

		Users user1 = new Users(1,"Oguzhan","Ozyakup","ozi@gmail.com","12345");
		Users user2 = new Users(1,"Bobo","Deivson Rog","bobo@gmail.com","1222345");
		Users user3 = new Users(1,"Gokhan ","Tore","gokhan@gmail.com","12334545");
	
		UserManager userManager = new UserManager(new HibernateUserDao());
		userManager.signUp(user1);
		userManager.signUp(user2);
		userManager.signUp(user3);
	
		userManager.login("newFootballer@gmail.com", "12345647");
		userManager.signUpWithAnotherService("newFootballer@gmail.com", "132456", new SignUpServiceAdapter());
	}

}
