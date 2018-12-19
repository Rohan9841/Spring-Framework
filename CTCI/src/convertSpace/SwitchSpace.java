package convertSpace;

public class SwitchSpace {
	
	String str = "";
	String outString = "";
	
	public SwitchSpace(String s)
	{
		str = s.trim();
	}
	
	public String getEditedString()
	{
		for (int i = 0; i<str.length();i++)
		{
			Character c = str.charAt(i);
			
			if(!Character.isWhitespace(c)) {
				outString += c;
			}
			else
			{
				outString += "%20";
			}
		}
		return outString;
	}
}
