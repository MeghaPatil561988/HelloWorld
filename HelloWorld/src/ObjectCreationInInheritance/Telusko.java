package ObjectCreationInInheritance;

public class Telusko
{

	public static void main(String[] args) 
	{
		//A a = new A();
		//B b = new B(5);
		A a = new B();//reference of super class and object of sub class

	}
}
class A
{
	public A()
	{
		System.out.println("In A constant");
	}
	public A(int i)
	{
		System.out.println("In A constant Int");
	}
}
class B extends A
{
	public B()
	{
		
		System.out.println("In B constant");
	}
	public B(int i)
	{
		
		System.out.println("In B constant Int");
	}
}