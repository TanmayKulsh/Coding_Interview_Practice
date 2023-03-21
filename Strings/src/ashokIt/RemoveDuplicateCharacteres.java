package ashokIt;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacteres {

	public static void main(String[] args) {

		// we have the 4 approaches to solve this
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// 1 -> using java 8

		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// 2 -> using indexof(...) method available in string class

		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == (-1)) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);

		// 3 -> using character Array
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (repeated == false) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);

		// 4 -> using Set interface method

		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for(Character c : set) {
			sb4.append(c);
		}
		
		System.out.println(sb4);
	}

}
