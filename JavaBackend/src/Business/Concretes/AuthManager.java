package Business.Concretes;

import Business.Abstracts.AuthService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AuthManager implements AuthService {
	
	private static final String regex="^[a-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	@Override
	public boolean checkFirstName(String firstName, String lastName) {
		if(firstName.length()<2 || lastName.length()<2) {
			System.out.println("Firstname and lastname  least must be 2 characters.!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkMail(String eMail) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if(matcher.matches())
		{
			return true;
		}
		else {
			System.out.println("E Mail invalid!.");
			return false;
		}
	}

	@Override
	public boolean checkMailExist(String eMail) {
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		return false;
	}

	@Override
	public boolean userIsValid(String name, String lastName, String eMail, String password) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if(name.length() < 2 || !matcher.matches() || password.length() < 6 || checkMailExist(eMail))
			{
				System.out.println("Error !!!");
			}
		else 
			{
				return true;
			}
			return false;
	}

	@Override
	public void sendConfirmMail() {
		System.out.println("The activation has been sent to the e-mail.");
	}

}
