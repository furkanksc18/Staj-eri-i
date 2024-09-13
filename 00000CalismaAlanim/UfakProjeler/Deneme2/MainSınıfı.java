package Deneme2;
import java.util.Scanner;

public class MainSınıfı {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Egzersiz");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.print("sayı1'i giriniz --> ");
		int sayı1 = oku.nextInt();
		System.out.print("sayı2'i giriniz --> ");
		int sayı2 = oku.nextInt();
		System.out.print("sayı3'i giriniz --> ");
		int sayı3 = oku.nextInt();
		System.out.print("sayı4'i giriniz --> ");
		int sayı4 = oku.nextInt();
		
		System.out.println("Sayı1 + Sayı2 = "+ (sayı1 + sayı2));
		System.out.println("Sayı1 - Sayı3 = "+ (sayı1 - sayı3));
		System.out.println("Sayı4 / Sayı2 = "+ (sayı4 / sayı2));
		System.out.println("Sayı3 * Sayı2 = "+ (sayı3 * sayı2));
		System.out.println("Sayı1 % Sayı2 = "+ (sayı3 % sayı4));
	}
}