package kamp5GunOdev1.business.concretes;

import kamp5GunOdev1.business.abstracts.ControlService;
import kamp5GunOdev1.business.abstracts.UserService;
import kamp5GunOdev1.business.abstracts.UserVerificationService;
import kamp5GunOdev1.dataAccess.abstracts.UserDao;
import kamp5GunOdev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private ControlService controlService;
	private UserVerificationService userverificitationService;

	public UserManager(UserDao userDao, ControlService controlService,
			UserVerificationService userverificitationService) {
		this.userDao = userDao;
		this.controlService = controlService;
		this.userverificitationService = userverificitationService;
	}

	@Override
	public void signIn(String email, String password) {
		if (userDao.getAll() != null) {
			for (User user : userDao.getAll()) {
				if (user.geteMail() == email && user.getPassword() == password) {
					System.out.println("Kullanıcı girişi başarılı!");
				} else
					System.out.println("Kullanıcı girişi başarısız!");
			}
		}
	}

	@Override
	public void signOut(String email, String password) {
		if (userDao.getAll() != null) {
			for (User user : userDao.getAll()) {
				if (user.geteMail() == email && user.getPassword() == password) {
					System.out.println("Kullanıcı çıkışı başarılı!");
				}
			}
		}

	}

	@Override
	public void register(User user) {
		if (controlService.checkUserName(user.getFirstName(), user.getLastName())) {
			if (controlService.checkUserEmail(user, userDao.getMail())) {
				if (userverificitationService.checkVerification()) {
					userDao.add(user);
				}
			}
		}
	}

}
