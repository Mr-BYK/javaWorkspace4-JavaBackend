package Core.Concretes;

import Core.Abstacts.SignUpService;
import GoogleService.GoogleRegisterManager;

public class SignUpServiceAdapter implements SignUpService{

	@Override
	public void SignUpWithAnotherAccount(String eMail, String password) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(eMail,password);	
	}

}
