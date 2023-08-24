package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample1
{

	public static void main(String[] args) 
	{
		String state1 ="maharastra";
		String state2 ="gujarat";
		String state3 ="SA";
		String state4 ="SA";
	
		
    Set<String> setOfString = new HashSet<String>();
	
	setOfString.add(state1);
	setOfString.add(state2);
	setOfString.add(state3);
	setOfString.add(state4);
	
	displaySetOfStrings( setOfString);
	
	
	
		
	}

	private static void displaySetOfStrings(Set<String> setOfString) {
		for(String city : setOfString)
		{
			System.out.println(city);
		}
		
	}
}


