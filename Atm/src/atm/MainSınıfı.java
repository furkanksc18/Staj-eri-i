package atm;

import java.util.Scanner;

public class MainSınıfı {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// giriş

		System.out.println("ATM");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1 - Bakiye Öğrenme");
		System.out.println("2 - Para Çekme");
		System.out.println("3 - Para Yatırma");
		System.out.println("4 - Çıkış");

		System.out.println();
		System.out.print("Yapmak istediğiniz işlemin numarasını girin --> ");
		int işlem = scanner.nextInt();
		int bakiye = 0;
		
		
		// işlem kontrol

		while ( !(işlem == 1 || işlem == 2 || işlem == 3 || işlem == 4) ) {
			System.out.print("Yanlış işlem numarası girişi. Tekrar giriniz. --> ");
			işlem = scanner.nextInt();
		}
		
		
		// Program çalışıyor

		while (işlem == 1 || işlem == 2 || işlem == 3) {

			if (işlem == 1) {
				System.out.println("************************************************************");
				System.out.println("Bakiyeniz: " + bakiye);
			}
			else if (işlem == 2) {
				System.out.println("************************************************************");
				System.out.println("Bakiyeniz: "+ bakiye);
				System.out.println();
				System.out.print("Çekmek istediğiniz tutarı girin --> ");
				int çt = scanner.nextInt();
				
				if (bakiye < çt) {
					System.out.println("************************************************************");
					System.out.println("Hesabınızdaki para yetersiz");
				}
				else {
					bakiye -= çt;
					System.out.println("Bakiyeniz: " + bakiye);
				}
				
			}
			else if (işlem == 3) {
				System.out.println("************************************************************");
				System.out.print("Yatırmak istediğiniz tutarı girin --> ");
				bakiye += scanner.nextInt();
				System.out.println("Bakiyeniz: " + bakiye);
			}
			
			System.out.println();
			System.out.println("--------------------------------------------------------------");
			System.out.println("1 - Bakiye Öğrenme");
			System.out.println("2 - Para Çekme");
			System.out.println("3 - Para Yatırma");
			System.out.println("4 - Çıkış");
			System.out.println();
			System.out.println("Yapmak istediğiniz işlemin numarasını girin --> ");
			işlem = scanner.nextInt();
			
			
			
		}
		
		System.out.println("Kapatılıyor....");
		
		
	}

}
