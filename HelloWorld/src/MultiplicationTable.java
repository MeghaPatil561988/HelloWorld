import java.util.Scanner;

public class MultiplicationTable
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Input the number : ");
		int num=in.nextInt();

		for(int i=1;i<=10;i++)
		{
		System.out.println(num+ " i " +i + " = " +num*i);
		}
	}
	
	
	/* Using While Loop
	 int num=3;
	 int i=1;
	 while(i<=10)
	 {
	 System.out.println(num*i);
	 i++;
	 }
	 * */

	}


