package kamp5GunOdev1.business.abstracts;


import kamp5GunOdev1.entities.concretes.User;

public interface UserService {
	void signIn(String email,String password);

	void signOut(String email,String password);

	void register(User user);
	
	
}
