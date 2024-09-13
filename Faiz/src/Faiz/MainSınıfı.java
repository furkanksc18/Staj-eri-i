package Faiz;

import java.util.Scanner;

public class MainSınıfı {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Giriş

		System.out.println("Bankamıza hoşgeldiniz. %6 Faiz ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		System.out.print("Ana para değerini giriniz --> ");
		float para = scanner.nextFloat();
		while (para < 1) {
				System.out.print("Hatalı değer girdiniz. Tekrar giriniz --> ");
				para = scanner.nextFloat();
		}
		
		System.out.print("Kaç yıl vade ile yatıracaksınız --> ");
		int yıl = scanner.nextInt();
		while (yıl < 1) {
			System.out.print("Hatalı değer girdiniz. Tekrar giriniz --> ");
			yıl = scanner.nextInt();
		}

		System.out.println("----------------------------------------------------------");
		
		for (int i = 1; i < yıl; i++) {
			
			para = para * 106 / 100;
			System.out.println(i +". sene sonunda ana para değeriniz: "+ para);
			
		}

		System.out.println("----------------------------------------------------------");
		System.out.println("Bizi Tercih ettiğiniz için teşekkürler");
		
	}

}
