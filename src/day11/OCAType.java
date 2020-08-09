package day11;

public class OCAType {

	public static void main(String[] args) {
		
		int num = 10;
		
		do {
			System.out.println(num-- + " " + num);
		}while(num == 0);
		
		/*
		 * A) 9876543210
		 * B) 9
		 * C) 421
		 * D) 9 10
		 * E) Nothing is printed
		 * F) 10 9 
		 * 
		 * yukarida ki increment sayimiz 10 islem devam ederken 9'a dusup yeni degeri 9 oluyor.
		 * 
		 */

	}

}
