package kamp5GunOdev1;

import kamp5GunOdev1.business.abstracts.UserService;
import kamp5GunOdev1.business.concretes.ControlManager;
import kamp5GunOdev1.business.concretes.UserManager;
import kamp5GunOdev1.business.concretes.UserVerificationManager;
import kamp5GunOdev1.core.concretes.AccessServiceAdapter;
import kamp5GunOdev1.dataAccess.concretes.RegisteredUserDao;
import kamp5GunOdev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService service = new UserManager(new RegisteredUserDao(),new ControlManager(), new UserVerificationManager());
		
		
		User user1 = new User(1, "Batuhan", "Balı", "batuhan@gmail.com", "123456");//Normal
		User user2 = new User(1, "Ahmet", "Sazan", "ahmetgmail.com", "123456");//Mail adresi hatalı
		User user3 = new User(1, "Murat", "Yılmaz", "muratYilmaz@gmail.com", "1234");//Şifresi hatalı
		User user4 = new User(1, "B", "B", "batuhan@gmail.com", "parola123");//İsim soyisim hatalı
		//User user5 = new User("batuhan@gmail.com","123456",new AccessServiceAdapter());
		//Bu kısımda google ile giriş yaptıramıyorum çünkü java.lang.NullPointerException hatası alıyorum ve çözümünü de bulamadım 
		//Onun harici bütün fonksiyonlar tam verimle çalışıyor
		
		service.register(user1);
		System.out.println("*************");
		service.register(user2);
		System.out.println("*************");
		service.register(user3);
		System.out.println("*************");
		service.register(user4);
		System.out.println("*************");
		//service.register(user5);
		//System.out.println("*************");
		
		service.signIn("batuhan@gmail.com", "123456");//Kullanıcı girişi başarılı!
		System.out.println("*************");
		service.signOut("batuhan@gmail.com", "123456");//Kullanıcı çıkışı başarılı!
		
		
		service.signIn("batuhan@gmail.com", "123456");//Kullanıcı girişi başarılı!
		System.out.println("*************");
		service.signIn("batuhan@gmail.com", "123456");// Tekrar Kullanıcı girişi başarılı!
		System.out.println("*************");
		service.signOut("batuhan@gmail.com", "123456");//Kullanıcı çıkışı başarılı!
		System.out.println("*************");
		
		
		service.signIn("batuhan@gmail.com", "12345");//Kullanıcı girişi başarısız!(yanlış şifre)
		System.out.println("*************");
		service.signIn("batuha@gmail.com", "123456");//Kullanıcı girişi başarısız!(yanlış mail)
		System.out.println("*************");
	}

}
