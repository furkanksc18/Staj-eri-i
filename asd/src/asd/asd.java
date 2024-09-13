package asd;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Beden Kitle Endeksi Hesaplama");
		System.out.println("----------------------------------------------------------");

		// boy ve kilo değerlerini alıyoruz

		System.out.print("boyunuzu girin (santimetre) --> ");
		int boy = scanner.nextInt();
		System.out.print("kilonuzu girin (kilogram) --> ");
		int kilo = scanner.nextInt();

		// Beden kitle indeksi hesaplaması

		double indeks = 10000 * kilo;
		indeks /= boy * boy;
		
		// Sonucu ekrana yazdırıyoruz
		
		System.out.println();
		System.out.println("Beden Kitle İndeksiniz --> "+ indeks);	

	}

}
