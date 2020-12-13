package javaExample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		String wordArr[] = {"apple", "watermelon", "peach", "QQ"};
		String reg = ".*[aeiouAEIOU].*";

		for(int i = 0; i < wordArr.length ; i++) {
			String word = wordArr[i];
			
			System.out.println(word);
			System.out.println("contains QQ :\t" + word.contains("Q"));
			
			
			Pattern pattern = Pattern.compile(reg); 
			Matcher matcher = pattern.matcher(word);
			System.out.println("matcher.matches() :\t" + matcher.matches());
			System.out.println("String.matches():\t" + word.matches(reg));
	        System.out.println("Pattern.matches():\t" + Pattern.matches(reg, word));

			
			
			
			System.out.println("===================");
		}
        
	}

}
