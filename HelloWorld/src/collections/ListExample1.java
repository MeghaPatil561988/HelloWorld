package collections;

import java.awt.List;
import java.util.ArrayList;

public class ListExample1 
{

	public static void main(String[] args) 
	{
		String state1 ="maharastra";
		String state2 ="gujarat";
		String state3 ="SA";
		String state4 ="SA";
		
		List<String> ls = new ArrayList<String>();
		ls.add(state1);
		displayListContents(ls);

	
	
	for(String state:ls)
	{
		System.out.println(state);
	}

}
}
