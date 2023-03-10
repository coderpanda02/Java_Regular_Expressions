package java_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//Java regex metachars ->
//
//. - any character
//\d - digit [0-9]
//\D - non-digit [^0-9]
//\w - any word character ([A-Za-z_0-9])
//\W - non-word [^\w]
//\s - white space (space, tab, newline)
//\S - non-white space [^\s]

public class Regex3_Metachars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to match with the pattern : ");
		String str = sc.next();

		System.out.println(Pattern.matches("[A-Za-z]?\\d",str)); 
		//checks only 1 char+digit, 1-> true, a-> false
		// a1-> true, a11-> false, as by default checks for
		//only 1 digit if quantifier not specified

		System.out.println(Pattern.matches("\\d+[A-Za-z]+", str)); 
		//123asd - true, asd12 - false
		System.out.println(Pattern.matches("[\\D]", str)); //a-true, 1-false; ,-true
		
		System.out.println(Pattern.matches("[\\w]", str));//1-true,a-true; ,-false
		System.out.println(Pattern.matches("[\\W]", str));//1-false,a-false; ,-true

		System.out.println(Pattern.matches("[\\s]", str));//1-false,a-false
		System.out.println(Pattern.matches("[\\S]", str));//1-false,a-false; ,-true
		
		System.out.println(Pattern.matches("[\\w\\s]", str));
		//1-false,a-false,'a '-true,'a\tab'-true

		
		sc.close();
	}

}
