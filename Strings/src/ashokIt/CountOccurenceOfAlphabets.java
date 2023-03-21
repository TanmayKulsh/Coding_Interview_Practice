package ashokIt;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurenceOfAlphabets {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] strArr = str.toCharArray();
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		
		for(char c: strArr) {
			if(counts.containsKey(c)) {
				int ct = counts.get(c);
				counts.put(c,ct+1);
			} else {
				counts.put(c, 1);
			}
		}
		System.out.println(counts);	
		sc.close();
	}

}