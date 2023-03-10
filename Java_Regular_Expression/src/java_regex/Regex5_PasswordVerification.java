package java_regex;

//A password is considered valid if all the following constraints are satisfied:
//
//It contains at least 8 characters and at most 20 characters.
//It contains at least one digit.
//It contains at least one upper case alphabet.
//It contains at least one lower case alphabet.
//It contains at least one special character which includes !@#$%^&*()_-
//It doesn’t contain any white space.

//String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&()_-])(?=\\S$).{8,20}$"
//where,
//
//^ -> indicates beginning of string
//(?=.*[0-9]) ->  means any char zero or more times then any digit at least once
//(?=.*[A-Z]) -> means any char zero or more times then at least one upper case char
//(?=.*[a-z]) -> means any char zero or more times then at least one lower case char
//(?=.*[!@#$%^&*()_-]) -> means any char zero or more times then any special among these
//(?=\\S+$) -> doesn't contain any white space (\\S+) -> non-white space char once or more
//.{8,20} -> any char, at least 8 chars, at most 20 chars
//$ -> indicates ending of string

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex5_PasswordVerification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the password to verify : ");
		String pass = sc.next();
		
		String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_-])"
						+ "(?=\\S+$).{8,20}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		if(pattern.matcher(pass).matches()) {
			System.out.println("Password Verified Successfully!");
		}
		else {
			System.out.println("Password Verification Failed!");
		}
		
		
		sc.close();
	}

}
