
public class NonStaticFunctions 
{
	 public static void main(String args[]) 
	 {
		 NonStaticFunctions d = new NonStaticFunctions();
	        d.add(10,20); 
	        d.sub(30,40);
	        d.mul(5,7);
	        d.div(10, 5);
	 }

	
	    public void add(int x ,int y) 
	    {
	    	 int a = x;
	         int b = y;
	        int c = a + b;
	        System.out.println("addition" + c);
	    }
	    public void sub(int x ,int y) 
	    {
	    	 int a = x;
	         int b = y;
	        int c = a - b;
	        System.out.println("subtraction" + c);
	    }
	    public void mul(int x ,int y) 
	    {
	    	 int a = x;
	         int b = y;
	        int c = a * b;
	        System.out.println("multipliaction" + c);
	    }
	    public void div(int x ,int y) 
	    {
	    	 int a = x;
	         int b = y;
	        int c = a / b;
	        System.out.println("division" + c);
	    }
}
