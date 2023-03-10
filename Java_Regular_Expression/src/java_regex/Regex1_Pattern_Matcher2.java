package java_regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Example of Matcher.find() method -> 
//Attempts to find the next subsequence of the input sequence that matches the pattern.
//returns true if match found

//matcher() matches the whole string while find() finds the matched subsequence from the string

public class Regex1_Pattern_Matcher2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the pattern for matching : ");
		String pattern = sc.next();  //eg: java
		Pattern p = Pattern.compile(pattern);
		
		System.out.println("Enter the string to match : ");
		String match = sc.next(); //eg: codeinjava
		Matcher m = p.matcher(match);
				
		//find() attempts to find the next subsequence of
		//the input sequence that matches the pattern
			
		while(m.find()) {
			
//			group() Returns the input subsequence matched by the previous match. 
			System.out.println("String '"+m.group()+"' found at starting index "+m.start()
									+" and ending at index "+m.end());	
			//prints output-> String 'java' found at starting index 6 and ending at index 10
			
//			System.out.println(match.charAt(m.start()); //index 6 -> j
//			System.out.println(match.charAt(m.end()); //index 10 -> it gives
//			StringIndexOutOfBoundsException, as last 'a' is at 9,
//			end() indicates the index no. after the subsequence ended, so it's 10
		}
	
		sc.close();

	}

}
