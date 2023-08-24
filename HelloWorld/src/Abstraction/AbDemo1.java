package Abstraction;

public class AbDemo1 
{
public static void main(String[] args) 
	{
		IPhone obj = new IPhone();
	    Samsungs4  obj1 = new Samsungs4();
	    show(obj);
	   
	}

private static void show(IPhone obj)
{
	obj.showConfig();
	
}

/*private static void  show(Samsungs4 obj1) 
{
	obj1.showConfig();
}
private static void show(IPhone obj)
    {
		obj.showConfig();
    }
}*/


}
abstract class Phone
{
	public abstract void showConfig();
}

class IPhone
{
	public void showConfig() 
	{
		System.out.println("2gb,IOS 9.3");
	}
}
class Samsungs4
{
	public void showConfig() 
	{
		System.out.println("2gb,IOS Lalipop");
	}
}