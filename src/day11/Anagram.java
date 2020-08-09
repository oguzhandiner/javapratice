package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		/*
		 * Anagram, bir kelimenin harflerinden baþka bir kelime oluþturmaya denir.
		 * Kullanýcýdan alýnacak iki kelimenin Anagram durumunu belirleyen Java kodunu
		 * yazýnýz. isAnagram("listen", "Silent") ==> true
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki kelime giriniz?");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println(isAnagram(str1, str2));
		
		scan.close();

	} 

	public static boolean isAnagram(String str1, String str2) {

		boolean isAnagram = false;
		char[] arr1 = str1.replace("", " ").toLowerCase().toCharArray();
		char[] arr2 = str2.replace("", " ").toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//sort () methodu alfabetik olarak siralar.
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(str1.length() != str2.length()) {
			return isAnagram = false;
		}
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i]) {
				return isAnagram = false;
			}
		}
		return isAnagram = true;
		

	}

}
