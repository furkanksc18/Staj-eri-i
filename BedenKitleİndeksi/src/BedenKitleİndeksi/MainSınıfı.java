package BedenKitleİndeksi;
import java.util.Scanner;

public class MainSınıfı {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Beden Kitle Endeksi Hesaplama");
		System.out.println("----------------------------------------------------------");
		
		//kosullu-kosulsuz tercihi
		
		System.out.println("kosullu için 1, kosulsuz için 2 yazınız.");
		int a = scanner.nextInt();
		
		while(a != 1 && a != 2) {
			
			System.out.println("Yanlis bir deger girdiniz. Tekrar girin.");
			a = scanner.nextInt();
		}
		
		
		
		// boy ve kilo değerlerini alıyoruz
		
		System.out.print("boyunuzu girin (santimetre) --> ");
		int boy = scanner.nextInt();
		System.out.print("kilonuzu girin (kilogram) --> ");
		int kilo = scanner.nextInt();
		
		// Beden kitle indeksi hesaplaması
		
		double indeks = 10000*kilo;
		indeks /= boy*boy;
		
		// degerleri ekrana gosterilecek methodu cagırıyoruz
		
		switch(a) {
			case 1:
				kosullu(indeks);
				break;
			case 2:
				kosulsuz(indeks);
				break;
		}
		
	}

	private static void kosulsuz(double indeks) {

		System.out.println();
		System.out.println("Beden Kitle İndeksiniz --> "+ indeks);

	}
	
	public static void kosullu(double indeks) {

		//Kullanıcıya verilenler
	
		System.out.println();
		if(indeks < 18.5 ) {
			System.out.print("Zayıf");
		}
		
		else if(18.5 < indeks && indeks < 25) {
			System.out.print("Normal kilolu ");
		}
		
		else if(25 < indeks && indeks < 30) {
			System.out.print("Fazla Kilolu");
		}
		
		else {
			System.out.print("Obez");
		}
		
	}
	
}
