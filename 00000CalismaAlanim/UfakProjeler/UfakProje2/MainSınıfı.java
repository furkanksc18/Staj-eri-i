package UfakProje2;

import java.util.Scanner;

public class MainSınıfı {
	
	public static Boolean asal(int sayı) {
		
		for(int i = 2; i < sayı; i ++ ) {
			
			if (sayı % i == 0) {
			
				return false;	
			
			}	
		}
		
		return true;
	
	}

	public static void main(String[] args) {

		// 100 e kadar asal sayı bulma

		Scanner scanner = new Scanner(System.in);

		System.out.println("1- Metodlu");
		System.out.println("2- Metodsuz ");
		System.out.print("Seç --> ");
		int seç = scanner.nextInt();

		if (seç == 1) {
			
			for (int i = 2; i < 100; i++) {
				
				if(asal(i)) {
					System.out.println(i);
				}
				
			}
			
			
		} else {	
			for (int i = 2; i < 101; i++) {
				int b = 0;

				if (i != 2) {

					for (int j = 2; j < i; j++) {

						if (i % j == 0) {
							b++;
						}

					}

				}

				if (b == 0) {
					System.out.println(i);
				}

			}
		}

	}

}
