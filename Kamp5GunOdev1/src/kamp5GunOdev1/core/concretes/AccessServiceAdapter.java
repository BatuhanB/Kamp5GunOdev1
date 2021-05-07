package kamp5GunOdev1.core.concretes;

import kamp5GunOdev1.core.abstracts.AccessService;
import kamp5GunOdev1.googleRegistration.GoogleRegistrationManager;

public class AccessServiceAdapter implements AccessService{

	@Override
	public void signIn(String email, String password) {
		GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
		googleRegistrationManager.signIn(email,password);
		
	}
	
}
