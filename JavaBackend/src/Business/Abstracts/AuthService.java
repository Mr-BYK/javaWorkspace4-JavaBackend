package Business.Abstracts;

public interface AuthService {
	
	boolean checkFirstName(String firstName , String lastName);
	boolean checkMail(String eMail);
	boolean checkMailExist(String eMail);
	boolean checkPassword(String password);
	boolean userIsValid(String name, String lastName, String eMail, String password);
	void sendConfirmMail();
}
