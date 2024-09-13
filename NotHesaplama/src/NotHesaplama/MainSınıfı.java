package NotHesaplama;

import java.util.Scanner;

public class MainSınıfı {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Not Hesaplama");
		System.out.println("------------------------------------------------------------");

		// kullanıcıdan vize ve final notlarını alıyoruz

		System.out.print("1. vize notunu giriniz --> ");
		int vize1 = scanner.nextInt();
		System.out.print("2. vize notunu giriniz --> ");
		int vize2 = scanner.nextInt();
		System.out.print("final notunu giriniz --> ");
		int final1 = scanner.nextInt();
		System.out.print("Okul ortalamanızı giriniz --> ");
		double oo = scanner.nextDouble();

		// toplamnot hesaplaması

		double toplamnot = vize1 * 3 / 10 + vize2 * 3 / 10 + final1 * 4 / 10;

		// Harf puanlaması

		String harf;

		if (toplamnot >= 90) {
			harf = "AA";
		} else if (toplamnot >= 85) {
			harf = "BA";
		} else if (toplamnot >= 80) {
			harf = "BB";
		} else if (toplamnot >= 75) {
			harf = "CB";
		} else if (toplamnot >= 70) {
			harf = "CC";
		} else if (toplamnot >= 65) {
			harf = "DC";
		} else if (toplamnot >= 60) {
			harf = "DD";
		} else if (toplamnot >= 55) {
			harf = "FD";
		} else {
			harf = "FF";
		}

		// Ekrana yazdırma

		System.out.println();
		System.out.println("Notunuz: " + harf);
		System.out.println("Toplam puanınız: " + toplamnot);

		if (harf == "DD" && oo >= 2.5) {
			System.out.println("Şartlı geçtiniz");
		} else if (toplamnot >= 65) {
			System.out.println("Bu dersi geçtiniz");
		} else {
			System.out.println("Kaldınız");
		}

	}

}
