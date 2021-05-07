package kamp5GunOdev1.business.concretes;

import kamp5GunOdev1.business.abstracts.UserVerificationService;

public class UserVerificationManager implements UserVerificationService{
 
	@Override
	public void sendVerificationLink() {
		System.out.println("Doğrulama linkiniz gönderildi. ");
		
	}
	
	@Override
	public boolean checkVerification() {
		System.out.println("Mail doğrulama işlemi başarılı.");
		return true;
		
	}

	

}
