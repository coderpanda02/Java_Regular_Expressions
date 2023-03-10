package java_regex;

//	Regex Example using java.lang.String.matches(String regex) ->

//	Tells whether or not this string matches the given regular expression. 
//	An invocation of this method of the form str.matches(regex) yields exactly the same result
//	as the expression java.util.regex.Pattern.matches(regex, str) 


public class Regex1_CharacterClasses {

	public static void main(String[] args) {

		String str1 = "a";
		String str2 = "ab";
		String str3 = "e";
		String str4 = "n";
		
		//regex character classes
		System.out.println(str1.matches("[A-Za-z]")); //checks if char is between A-Z or a-z
		System.out.println(str2.matches("[A-Za-z]")); //returns false as more than 1 char given
		
		System.out.println(str3.matches("[a-f[m-p]]")); //union - checks a to f or m to p
		System.out.println(str4.matches("[a-f[m-p]]")); //union - checks a to f or m to p
		
		System.out.println(str3.matches("[a-f&&[d-f]]")); //intersection - checks d to f only
		System.out.println(str4.matches("[a-s&&[d-f]]")); //intersection - checks d to f only
		System.out.println(str4.matches("[a-s&&[^d-n]]")); // checks a to s except d to n
		System.out.println(str1.matches("[a-s&&[^d-n]]")); // checks a to s except d to n
		
	}

}
