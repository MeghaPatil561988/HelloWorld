
public class evenORodd 
{
	public static void main(String[] args)
	{
		findIfEvenOrOdd(1);
	}
	

static void findIfEvenOrOdd(int x)
{
	for(x=1;x<=10;x++)
	if(x%2==0)
	{
		System.out.println("even"+x);
	}
	else
	{
		System.out.println("odd"+x);
	}
}
}