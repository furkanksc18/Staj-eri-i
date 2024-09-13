package ÇarpımTablosu;

public class MainSınıfı {
	
	public static void main(String[] args) {
	
		for (int i = 1; i < 11; i++) {
			
			System.out.println("--------------------------------");
			System.out.println(i +" ile çarpma");
			System.out.println("--------------------------------");
			
			for (int j = 1; j < 11; j++) {
				
				System.out.println(i +" x "+ j +" = "+ i*j);
				
			}
			
			System.out.println();
			
		}
		
	}
	
	

}
