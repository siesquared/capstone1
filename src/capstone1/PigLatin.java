package capstone1;


import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a word and watch it transform: ");
		String input = scnr.nextLine();

		scnr.close();
		
		if (thisVowel(input.charAt(0))) {
			input += "ay";
			System.out.println(input);
		} else {
			String output = "";
			int separation_index = findFirst(input);
			if (separation_index == -1) {
				System.out.println(input + "ay");
			
			}
			output += input.substring(separation_index);
			output += input.substring(0, separation_index) + "ay";
			System.out.println(output);
		}

	}

	public static boolean thisVowel(char ch) {

		char l = Character.toLowerCase(ch);
		return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'y';
	}

	private static int findFirst(String str) {
		
	for(int i = 0;i<str.length();i++){
		

		if (thisVowel(str.charAt(i))) {
			return i;
		}
	
	}
	return -1;
	}
}
