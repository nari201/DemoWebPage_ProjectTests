package Java_Tests;

import java.util.Scanner;

public class RemoveStringChars_WithReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter String value: ");
		//String StringValue = scanner.nextLine();
		
		String StringValue= "hellow_Test 123@&&^  ...   Space---";
		
		String AlphabetsOnly = StringValue.replaceAll("[^a-zA-Z]", "");
		
		String digitsOnly = StringValue.replaceAll("[^0-9]", "");
		
		String specialCharsOnly = StringValue.replaceAll("[0-9a-zA-Z]", "");
		
		System.out.println("Alphabets Only: "+ AlphabetsOnly);
		
		System.out.println("Digits Only: "+digitsOnly);
		
		System.out.println("Special Chars Only: "+specialCharsOnly);
		
		System.out.println("Remove Spaces and SpeciaChars "+StringValue.replaceAll("[^0-9a-zA-Z]", ""));
		
	//	while () {}
		
	}

}
