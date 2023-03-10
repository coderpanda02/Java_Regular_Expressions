package java_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//regex for email validation =>
//"^(?=.{1,100}$)(?=.{1,50}@)([A-Za-z0-9_.]+(@{1})[A-Za-z.]+)$"
//
//	where '^' means beginning of the string and  '$' means ending of the string
//	(?=.{1,100}) is used to define the length of the string, string should have 
//	at least 1 char and at most 100 chars, (?=.{1,50}@) - at most 50 chars before @

public class Regex4_EmailValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email to check : ");
		String str = sc.next();
		
		String regex = "^(?=.{1,100}$)(?=.{1,50}@)([A-Za-z0-9_.]+(@{1})[A-Za-z.]+)$";
		Pattern pattern = Pattern.compile(regex);
		
//		Pattern.matches(pattern, str); 
		//gives error as matches() don't take Pattern input (only string input accepted)
		//so pattern.matcher(str).matches() is used here
		
		boolean flag = false;
		if(pattern.matcher(str).matches()) {
			if(str.endsWith("@google.com")) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Email validated successfully!");
		}
		else {
			System.out.println("Email validation failed!");
		}

		
		sc.close();

	}

}
