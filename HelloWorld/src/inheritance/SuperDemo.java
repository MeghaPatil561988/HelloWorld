package inheritance;

public class SuperDemo 
{

	public static void main(String[] args)
	{
		//A2 obj1 = new A2();
		B2 obj2 = new B2();  // u call the default constructor of super class

	}

}
class A2 //super class
{
	public A2()
	{
		super(); //every constructor by default method called as super()
		System.out.println("In const A");
	}
}
class B2 extends A2 // sub class
{
	public B2()
	{
		System.out.println("In const B");
	}
}
