package convertSpace;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please write a sentence.");
		String w = in.nextLine();
		
		SwitchSpace s = new SwitchSpace(w);
		
		System.out.println(s.getEditedString());
		
		in.close();
	}
}