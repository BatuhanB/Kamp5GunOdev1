package kamp5GunOdev1.dataAccess.abstracts;

import java.util.List;

import kamp5GunOdev1.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<String> getMail();

	List<User> getAll();

}
