
//PROGRAM TO FIND IF THE TWO STRINGS ARE ROUNDED TO EACH OTHER.

package roundedSubstring;

public class isRoundedString {
	
	String s1 = "";
	String s2 = "";
	
	public isRoundedString(String s1,String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public boolean isRounded()
	{
		StringBuilder str = new StringBuilder();
		
		//going through each characters of s2
		for(int i = 1; i<s2.length(); i++)
		{
			//for the words to be rounded, the first and last character of s1 must be together in s2. i.e last char should be behind the first char.
			if( (s1.charAt(0) == s2.charAt(i)) && (s1.charAt(s1.length()-1) == s2.charAt(i-1)))
			{
				//cutting s2 from the first char of s1 to the end
				String sub1 = s2.substring(i, s2.length());
				
				//cutting s2 from the first char of s2 to the last char of s1
				String sub2 = s2.substring(0,i);
				
				//appending the strings in stringbuilder object
				str.append(sub1);
				str.append(sub2);
				
				//after appending the string of s2, if we get same string as s1, the strings are rounded
				if(str.toString().equals(s1))
				{
					return true;
				}
				
				//if we don't have same strings, then make new stringbuilder object so that we can append other strings in the loop
				else
				{
					str = new StringBuilder();
				}
			}
		}

		return false;
	}
}
