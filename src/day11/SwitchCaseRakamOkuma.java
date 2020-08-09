package day11;

import java.util.Scanner;

public class SwitchCaseRakamOkuma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Telefon Numaranizi Giriniz?");
		String telefon = scan.nextLine().replace(" ", "");
		
		
		for(int i = 0; i < telefon.length(); i++) {
			int birler = new Integer (telefon.substring(i, i+1));
			
			switch (birler) {
			case 0: System.out.print("sifir");break;
			case 1: System.out.print("bir");break;
			case 2: System.out.print("iki");break;
			case 3: System.out.print("uc");break;
			case 4: System.out.print("dort");break;
			case 5: System.out.print("bes");break;
			case 6: System.out.print("alti");break;
			case 7: System.out.print("yedi");break;
			case 8: System.out.print("sekiz");break;
			case 9: System.out.print("dokuz");break;
			
			default: break;

			}
		}
	}

}
