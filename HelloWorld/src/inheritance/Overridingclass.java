package inheritance;

public class Overridingclass
{

	public static void main(String[] args) 
	{
		C obj = new C();
		obj.show();

	}
}
	class B
	{
		public void show()
		{
			System.out.println("in show B");
		}
	}
	class C extends B
	{
		public void show()
		{
			System.out.println("in show C");
		}
	}


