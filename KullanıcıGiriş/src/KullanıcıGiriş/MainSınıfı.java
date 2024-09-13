package KullanıcıGiriş;

import java.util.Scanner;

public class MainSınıfı {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kullanıcı giriş");
		System.out.println("-------------------------------------");
		
		String user = "TheV4tibia";
		String password = "123456";
		int gh = 3;
		
		while (gh > 0) {
			
			System.out.print("Kullanıcı adınızı girin --> ");
			String u = scanner.next();
			System.out.print("Şifrenizi giriniz --> ");
			String p = scanner.next();
			
			if (u.equals(user) && p.equals(password)) {
				
				System.out.println("----------------------------------------------------------------");
				System.out.println("Hoşgeldin "+ u);
				break;
				
			} else {
				
				gh--;
				System.out.println("Kullanıcı adınız yada şifreniz yanlış tekrar deneyin.");
				System.out.println("----------------------------------------------------------------");
				if(gh == 0) {
					System.out.println("Giriş hakkınız doldu. Program kapatılıyor...");
					break;
				}
				
			}
			
		}
		
		
		
	}

}
