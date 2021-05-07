package kamp5GunOdev1.business.concretes;

import java.util.List;
import java.util.regex.*;

import kamp5GunOdev1.business.abstracts.ControlService;
import kamp5GunOdev1.entities.concretes.User;

public class ControlManager implements ControlService {

	String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	
	
	@Override
	public boolean checkUserName(String firstName, String lastName) {
		if (firstName.length() < 2 && lastName.length() < 2) {
			System.out.println("Kullanıcı adı ve soyadı en az 2 karakterden oluşmalıdır.");
			return false;
		} else
			return true;
	}

	@Override
	public boolean checkUserEmail(User user, List<String> emailList) {
		for (String email : emailList) {
			if (user.geteMail() == email) {
				System.out.println("Bu mail adresi sistemimize kayıtlıdır.");
				return false;
			}
		}

		if (!Pattern.matches(emailRegex, user.geteMail())) {
			System.out.println("Girilen mail adresi doğru formatta değil!");
			return false;
		}

		return true;

	}

	@Override
	public boolean checkUserPassword(String passwordLength) {
		if (passwordLength.length() < 6) {
			System.out.println("Parola en az 6 karakterden oluşmalıdır.");
			return false;
		} else
			return true;
	}

	

}
