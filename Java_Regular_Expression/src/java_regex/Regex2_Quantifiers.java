package java_regex;

import java.util.regex.Pattern;

import java.util.Scanner;

//Regex Quantifiers are used to determine the occurrence of chars in pattern-> 
//
//x? - only once or none
//x+ - once or more
//x* - zero or more
//x{n} - occurs n times only
//x{n,} - occurs n or more times
//x{m,n} - occurs at least m times and at most n times

public class Regex2_Quantifiers {

	public static void main(String[] args) {
		
		Pattern pattern1 = Pattern.compile("[A-Fa-f]?");
		Pattern pattern2 = Pattern.compile("[A-Fa-f]+");
		Pattern pattern3 = Pattern.compile("[A-Fa-f]*");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to match with the pattern : ");
		String str = sc.next();
		
		System.out.println(pattern1.matcher(str).matches()); //Aad - false
		System.out.println(pattern2.matcher(str).matches()); //true
		System.out.println(pattern3.matcher(str).matches()); //true
		
		//"^  $" -defines beginning and ending of the string
		System.out.println(Pattern.matches("^[A-Za-z]+(\\s{1})[A-Za-z]+$", str)); 
		//as as - true,  '\\s{1}' should always be inside ()
		
		System.out.println(Pattern.matches("^[A-Za-z]+(\\d{2,})[A-Za-z]+$", str));
		//as123as -true
		
		System.out.println(Pattern.matches("^[A-Za-z]+(\\d{1,2})[A-Za-z]+$", str)); 
		//as1as - true, as12as - true, as123as - false

		sc.close();
	}

}
