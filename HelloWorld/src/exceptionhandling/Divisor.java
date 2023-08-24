package exceptionhandling;

public class Divisor 
{

	public static void main(String[] args) 
	{
	try 
	{	
      int x=60;
      int y= 0;
      int result =x/y;
      System.out.println(result);
	
	}
	catch(Exception e)
	{
		System.out.println("Handle error denominator can not be zero try again");
	}
	
	}
}