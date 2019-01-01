package balancedParenthesis;

public class Driver {
	
	public static void main(String[] args)
	{
		String expression = "{([)]}";
		
		char[][] bracketPair = {{'[',']'},{'{','}'},{'(',')'}};
		
		checkBalance c = new checkBalance(bracketPair, expression);
		
		System.out.println(c.isBalance());
	}
}
