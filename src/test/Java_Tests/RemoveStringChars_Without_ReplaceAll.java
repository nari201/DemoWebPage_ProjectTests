package Java_Tests;

import org.testng.internal.protocols.Input;

public class RemoveStringChars_Without_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String StringValue = "hellow_Test 123@&&^  ...   Space---";

		String AlphabetsOnly = "";
		String SpecialCharOnly = "";
		String DigitsOnly = "";
		String AlphaNumaricOnly = "";

		for (int i = 0; i < StringValue.length(); i++) {

			char c = StringValue.charAt(i);
			if (Character.isLetter(c)) {

				AlphabetsOnly += c;
			}
			if (Character.isDigit(c)) {

				DigitsOnly += c;
			}
			if ( !Character.isDigit(c) && !Character.isLetter(c) && !Character.isSpaceChar(c)) {

				SpecialCharOnly += c;
			}

		}

		System.out.println("Alphabets Only: " + AlphabetsOnly);
		System.out.println("Digits Only: " + DigitsOnly);
		System.out.println("SpecialCharOnly Only: " + SpecialCharOnly);

	}

}
