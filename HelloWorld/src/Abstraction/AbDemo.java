package Abstraction;

public class AbDemo 
{
   public static void main(String args[])
   {
	  //  MaheshPhone obj = new  MaheshPhone(); can not instantiate object of abstract class
	   //obj.call();
	   MaheshPhone obj = new SureshPhone();
	   obj.call();
	   obj.cook();
	   obj.dance();
	   obj.move();
   }
}

abstract class MaheshPhone
{
	public void call()
	{
		System.out.println("calling");
	}
	public abstract void move(); //abstract methods
	public abstract void dance();
	public abstract void cook();
}
 
abstract class RameshPhone extends MaheshPhone
 {
	  public void move()
	  {
		  System.out.println("moving"); 
	  }
 }
class SureshPhone extends RameshPhone  //concrete class
{
    public void dance() 
	{
		System.out.println("dancing"); 
	}
    public void cook() 
	{
		System.out.println("cooking"); 
	}
}
