package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex1_Pattern_Matcher1 {

	public static void main(String[] args) {
		
		//compile methods compiles the given regular expression into a pattern.
		Pattern p = Pattern.compile(".bc"); //'.'->checks any character, only 1 char per dot
		Pattern p2 = Pattern.compile("..bc.");
		
		//matcher method creates a matcher that will match 
		//the given input against this pattern.
		Matcher m = p.matcher("dbc"); 
		Matcher m2 = p2.matcher("aabcx");
		Matcher m3 = p2.matcher("aaabcx");
		
		//matches method attempts to match the entire region against the pattern.
		//returns true if input in matcher matches with the regex in pattern
		System.out.println(m.matches()); 
		System.out.println(m2.matches()); 
		System.out.println(m3.matches()); //returns false as 3 chars before bc
		
		
		//Pattern.matches(regex, input) Compiles the given regular expression and 
		//attempts to match the given input against it. 
		System.out.println(Pattern.matches("..bc", "aabc"));
		System.out.println(Pattern.matches("..bc", "abc"));
		
		//If a pattern is to be used multiple times, compiling it once and reusing it
		//like the previous way will be more efficient than invoking this method each time.
		
		
		//Pattern.matches(regex, input) behaves in exactly the same way
		//as Pattern.compile(regex).matcher(input).matches()
		System.out.println(Pattern.compile("..bc").matcher("aabc").matches());
		
		
		System.out.println(Pattern.matches("\\d", "1"));
		
	}

}
