
public class Sumofvaluesgivenarray {

	static int[] marks = {69, 85, 66, 80, 81 };
	
	public static void main(String[] args) 
	{
		System.out.println("sum of values of given array"+sum());
	}
	static int sum()
	{
		 int sum = 0; 
         
            for (int i = 0; i < marks.length; i++) 
            sum +=  marks[i]; 
            return sum; 
	}

}
