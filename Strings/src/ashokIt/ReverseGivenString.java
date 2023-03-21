package ashokIt;

import java.util.Scanner;

public class ReverseGivenString {

	public static void main(String args[]) {
		
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for (int i=(str.length()-1);i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
	
	

