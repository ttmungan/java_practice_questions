package day04;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		// Kullanicidan bir kelime alip tersini yazdiralim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen metin giriniz");
		
		String str=input.nextLine();
		StringBuilder stb2 = new StringBuilder(input.nextLine());
		stb2.reverse();
		System.out.println(stb2);
		String tersStr="";
		System.out.println(str.length()-1);
		
		for(int count=str.length()-1;count>=0;count--) {
			
			tersStr=tersStr+str.charAt(count);//adana
		}
		System.out.println(str);
		System.out.println(tersStr);
		
		

	}

}
