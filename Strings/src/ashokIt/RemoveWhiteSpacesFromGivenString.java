package ashokIt;

import java.util.Scanner;

public class RemoveWhiteSpacesFromGivenString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// using regexp
		System.out.println(str.replaceAll(" ", ""));
		
		// using regexp
		System.out.println(str.replaceAll("\\s", ""));
						
		String str2 = str.trim();  // trim removes spaces from before and after the string but not from between the string
		//so we have to use the regexp with the replaceAll method
		// using trim method 
		System.out.println(str2);
		
		
	}

}
