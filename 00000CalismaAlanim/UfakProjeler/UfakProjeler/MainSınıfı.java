package UfakProjeler;

import java.util.Scanner;

public class MainSınıfı {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Girilen sayının rakamları toplamını veren program
		
		System.out.print("Bir sayı giriniz --> ");
		int sayı1 = scanner.nextInt();
		int rakamlarToplam = 0;

		do {
			rakamlarToplam += sayı1 % 10;
			sayı1 /= 10;

		} while (sayı1 != 0);

		System.out.println("Girdiğiniz sayının rakamları toplamı: " + rakamlarToplam);
	}

}
