package compressString;

import java.util.*;

public class CompressString {
	
	//Map to store character --> no.of repetition
	Map<Character, Integer> aMap = new HashMap<>();
	
	//Instance variable that stores passed argument
	String word = "";
	
	//Stringbuilder to avoid string concatenation(O n^2)
	StringBuilder str = new StringBuilder();
	
	//Construtor to get the passed string from driver class
	public CompressString(String s)
	{
		word = s;
	}
	
	//Method to compress the string
	public String compress() {
		
		//For each characters in the string
		for (int i = 0; i<word.length(); i++)
		{
			//Storing each character in variable c
			Character c = word.charAt(i);
			
			//if the map doesn't contain the character as its key, put c --> 1.  
			if(!aMap.containsKey(c)) {
				aMap.put(c, 1);
			}
			
			//if map already contains, then increase the value of that key by 1 because of one more such key.
			else
			{
				aMap.put(c, aMap.get(c)+1);
			}
		}
		
		//iterating over all the keys in the map
		for(Character each: aMap.keySet()) {
			
			//appending the key+value in the str.
			str.append(each);
			str.append(aMap.get(each));
		}
		
		//return str only if it is smaller than the actual string
		if(str.length() < word.length()) {
			return str.toString();
		}
		return word;
	}
}
