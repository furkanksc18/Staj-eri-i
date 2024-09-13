package BHM;
import java.util.Scanner;

public class MainSinifi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Basit Hesap Makinesi ");
		System.out.println("--------------------------------------------------------------------");
		
		// switch case ile 4 işlemli hesap makinesi
		
		//işlem tercihi
	
		System.out.println();
		System.out.println("1 - Toplama");
		System.out.println("2 - Çıkarma");
		System.out.println("3 - Çarpma");
		System.out.println("4 - Bölme");
		System.out.println();
		
		System.out.print("Yapmak istediğiniz işlemin numarasını giriniz --> ");
		int islem = scanner.nextInt();
		
		//işlemler
		
		double sayı1;
		double sayı2;
		double sonuç;
		
		switch(islem) {
		case 1: // toplama işlemi
			
			System.out.print("toplanacak birinci sayıyı giriniz");
			sayı1 = scanner.nextDouble();
			System.out.print("toplanacak ikinci sayıyı giriniz");
			sayı2 = scanner.nextDouble();
					
			sonuç = sayı1 + sayı2;		
			System.out.print("Sonuç: "+ sonuç);
					
			break;
		case 2: // çıkarma işlemi
			
			System.out.print("birinci sayıyı giriniz");
			sayı1 = scanner.nextDouble();
			System.out.print("çıkartılacak sayıyı giriniz");
			sayı2 = scanner.nextDouble();
					
			sonuç = sayı1 - sayı2;		
			System.out.print("Sonuç: "+ sonuç);
					
			break;
		case 3: // çarpma işlemi
			
			System.out.print("çarpılacak birinci sayıyı giriniz");
			sayı1 = scanner.nextDouble();
			System.out.print("çarpılacak ikinci sayıyı giriniz");
			sayı2 = scanner.nextDouble();
					
			sonuç = sayı1 * sayı2;		
			System.out.print("Sonuç: "+ sonuç);
			
			break;
		case 4: // bölme işlemi
			
			System.out.print("bölünen sayıyı giriniz");
			sayı1 = scanner.nextDouble();
			System.out.print("bölen sayıyı giriniz");
			sayı2 = scanner.nextDouble();
					
			sonuç = sayı1 / sayı2;
			System.out.print("Sonuç: "+ sonuç);
					
			break;
		default:
			
			System.out.print("Yanlış işlem numarası girdiniz.");
			System.out.println("Program kapatılıyor...");
			
			break;
		}
	}
}