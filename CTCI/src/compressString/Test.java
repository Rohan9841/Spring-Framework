package compressString;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type a word");
		
		//getting the user input
		String w = in.next();
		
		//creating object of CompressString
		CompressString c = new CompressString(w);
		
		//calling the compres method
		System.out.println(c.compress());
		
		in.close();
		
	}
}
