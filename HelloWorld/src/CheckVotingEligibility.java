import java.util.Scanner;

public class CheckVotingEligibility
{
public static void main(String[] args)
{
	checkVotingEligibility(15);
	
	
}
static void checkVotingEligibility(int age)
{
	//Scanner sc=new Scanner(System.in);
	//System.out.print("What is your age?");
	//age=sc.nextInt();
	if(age>=18)
	System.out.println("You are eligible to vote.");
	else
	System.out.println("You are not eligible to vote.");


}
}
