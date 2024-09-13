package girilen3sayidanbüyükolan;
import java.util.Scanner;

public class MainSinifi {
	
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		// Başlık
		
		System.out.println("Buyuk Sayiyi Bulma");
		System.out.println("-------------------------------------------------------------");
		
		// kullanıcıdan 3 tamsayı alıyoruz
		
		System.out.println();
		System.out.print("Birinci sayiyi giriniz --> ");
		int sayi1 = oku.nextInt();
		System.out.print("İkinci sayiyi giriniz --> ");
		int sayi2 = oku.nextInt();
		System.out.print("Üçüncü sayiyi giriniz --> ");
		int sayi3 = oku.nextInt();
		
		// Büyük olan sayıyı belirliyoruz
		
		int buyuk;
		if(sayi1 >= sayi2 && sayi1 >= sayi3) {
			buyuk = sayi1;
		}
		else if(sayi2 >= sayi1 && sayi2 >= sayi3) {
			buyuk = sayi2;
		}
		else{
			buyuk = sayi3;
		}
		
		// Büyük olan sayıyı ekrana yazdırıyoruz
		
		System.out.println();
		System.out.println("En buyuk sayi: "+ buyuk);
		
	}

}
