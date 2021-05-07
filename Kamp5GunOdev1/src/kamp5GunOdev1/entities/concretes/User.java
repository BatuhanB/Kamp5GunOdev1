package kamp5GunOdev1.entities.concretes;

import kamp5GunOdev1.core.abstracts.AccessService;
import kamp5GunOdev1.entities.abstracts.Entity;


public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	AccessService accessService;
	
	public User() {}
	
	public User(String eMail,String password,AccessService accessService) {
		this.eMail = eMail;
		this.password = password;
		this.accessService = accessService;
	}
	
	public User(int id, String firstName, String lastName, String eMail, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
