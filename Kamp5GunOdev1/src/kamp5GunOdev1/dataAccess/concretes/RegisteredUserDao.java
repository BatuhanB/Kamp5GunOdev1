package kamp5GunOdev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kamp5GunOdev1.dataAccess.abstracts.UserDao;
import kamp5GunOdev1.entities.concretes.User;

public class RegisteredUserDao implements UserDao {
	// Aldığımız verileri bu arrayListlere atıyorum (veritabanı simüle ettim)
	List<User> userList = new ArrayList<User>();
	List<String> mailList = new ArrayList<String>();

	@Override
	public void add(User user) {
		userList.add(user);
		mailList.add(user.geteMail());
		System.out.println("Veritabanına eklendi. " + user.getFirstName() + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Veritabanında güncellendi. " + user.getFirstName() + user.getLastName());

	}

	@Override
	public void delete(User user) {
		userList.remove(user);
		mailList.remove(user.geteMail());
		System.out.println("Veritabanından silindi. " + user.getFirstName() + user.getLastName());
	}

	@Override
	public User get(int id) {

		for (User user : userList) {

			if (user.getId() == id) {
				System.out.println("Kullanıcı id: " + user.getId() + "Kullanıcı adı ve soyadı: " + user.getFirstName()
						+ " " + user.getLastName());
				return user;
			}
		}
		return null;
	}


	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public List<String> getMail() {
		return mailList;
	}


}
