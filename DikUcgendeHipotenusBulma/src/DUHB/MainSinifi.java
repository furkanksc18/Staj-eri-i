package DUHB;
import java.util.Scanner;

public class MainSinifi {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Dik Ucgende Hipotenus Bulma");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.print("Ucgenin bir kenarini girin --> ");
		double kenarbir = oku.nextInt();
		System.out.print("Ucgenin diger kenarini girin --> ");
		double kenariki = oku.nextInt();
		
		double h = Math.sqrt( kenarbir * kenarbir + kenariki * kenariki);
		
		System.out.println();
		System.out.println("Hipotenus: "+ h);
	}
}