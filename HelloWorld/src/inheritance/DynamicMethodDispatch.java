package inheritance;

public class DynamicMethodDispatch 
{

	public static void main(String[] args)
	{
		A1 obj1 = new A1();
		B1 obj2 = new B1();
		obj1.show();
		obj2.show();
		
		/*A1 a;
		a=obj1;
		a.show();*/
		
		A1 a;
		a=obj2;
		a.show();
		
	}

}
class A1
{
	public void show()
	{
		System.out.println("in show A1");
	}
}
class B1 extends A1
{
	public void show()
	{
		System.out.println("in show B1");
	}
}
