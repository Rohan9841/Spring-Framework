package balancedParenthesis;

import java.util.*;

public class checkBalance {
	
	Map<Character, Character> aMap = new HashMap<>();
	Stack<Character> s = new Stack<>();
	
	char[][] token;
	String expression;
	
	public checkBalance(char[][] c, String s)
	{
		token = c;
		expression = s;
	}
	
	public void putInMap()
	{
		for(char[] each: token)
		{
			aMap.put(each[0],each[1]);
		}
	}
	
	public boolean isMatch(char a, char b)
	{
		return(a == b);
	}
	
	public boolean isBalance()
	{
		boolean check = true;
		putInMap();
		
		for (char each: expression.toCharArray())
		{
			if(aMap.containsKey(each))
			{
				s.push(each);
			}
			else
			{
				if(s.isEmpty() || !isMatch(aMap.get(s.pop()), each))
				{
					check = false;
					return check;
				}
			}
		}
		
		return check;
	}
}	
