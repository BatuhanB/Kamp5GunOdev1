package kamp5GunOdev1.business.abstracts;

import java.util.List;

import kamp5GunOdev1.entities.concretes.User;

public interface ControlService {
	 boolean checkUserEmail(User user, List<String> emailList);
	 boolean checkUserPassword(String passwordLength);
	 boolean checkUserName(String firstName, String lastName);
}
