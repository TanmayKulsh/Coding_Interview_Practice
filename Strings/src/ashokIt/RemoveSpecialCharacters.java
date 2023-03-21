package ashokIt;

import java.util.Scanner;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String plainstr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainstr);
	}

}
