package lambdaExpressions;

@FunctionalInterface 
interface Cab2
{
	public String bookCab(String source,String destination);
}

public class Test2 {

	public static void main(String[] args) 
	{
		Cab2 cab = (source,destination) -> {System.out.println("ola cab is booked from source" +source+ "to destinaton"+destination);
	    return("price : 5000 Rs");
	    };
	    System.out.println(cab.bookCab("bangalore","mumabai"));	
	}
}
