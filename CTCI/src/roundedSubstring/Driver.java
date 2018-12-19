package roundedSubstring;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first String");
		String s1 = in.next();
		
		System.out.println("Enter second String");
		String s2 = in.next();
		
		isRoundedString s = new isRoundedString(s1,s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Is Rounded? "+s.isRounded());
	}
}
