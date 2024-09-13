package KGYT;
import java.util.Scanner;

public class MainSınıfı {
	
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Kilometreye Göre Ödenecek Yakıt Ücreti Hesaplama ");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.print("Aracınız kilometrede kaç yakıyor (kurus) --> ");
		int kurus = oku.nextInt();
		
		System.out.print("Kaç kilometre yol gittiniz --> ");
		int yol = oku.nextInt();
		
		double kgyt = yol*kurus;
		kgyt /= 100;
		
		System.out.println("Harcadığınız yakıt " + kgyt + "tl dir");
		
		
		
	}
	
	
	

}
