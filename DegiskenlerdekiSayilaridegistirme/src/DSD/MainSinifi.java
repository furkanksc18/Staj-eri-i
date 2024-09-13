package DSD;
import java.util.Scanner;

public class MainSinifi {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Degiskenler Icerisindeki Degerlerin Yerlerini Degistirme");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.print("Birinci tam sayiyi giriniz --> ");
		int birinci = oku.nextInt();
		
		System.out.print("Ikinci tam sayiyi giriniz --> ");
		int ikinci = oku.nextInt();
		
		System.out.println();
		System.out.println("Degistirilmeden once...");
		System.out.println("Birinci sayi --> "+ birinci);
		System.out.println("İkinci sayi --> "+ ikinci);
		
		
		int gecici=birinci;
		birinci=ikinci;
		ikinci=gecici;
		
		System.out.println();
		System.out.println("Degistirildikten sonraz...");
		System.out.println("Birinci sayi --> "+ birinci);
		System.out.println("İkinci sayi --> "+ ikinci);
		
	
		
		
		
		
	}
}
