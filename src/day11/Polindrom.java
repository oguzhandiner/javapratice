package day11;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {

		/*
		 * Bir palindrom, madam veya racecar veya 10801 sayýsý gibi ileriye doðru geriye
		 * doðru okuyan bir kelime, sayý, kelime öbeði veya diðer karakter dizisidir.
		 * Girilecek kelimenin palindrom olup olmadýðýný doðrulayacak bir Java Kodu
		 * yazýn. madam 1234321
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Polindrom icin deger giriniz?");
		String str = scan.nextLine().toLowerCase().replace("", " ");

		/*
		 * toLowerCase() methodu harfleri kucuk yapar. replace() methodu bosluklari
		 * siler.
		 */
		int count = str.length() - 1;
		// length() methodu uzunlugu olcer.

		String tersi = "";

		for (; count >= 0; count--) {
			tersi = tersi + str.charAt(count);
		}

		// equals() methodu Stringleri birbirine esitler.
		if (tersi.equals(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scan.close();

	}

}
