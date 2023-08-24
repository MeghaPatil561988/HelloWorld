package lambdaExpressions;

@FunctionalInterface 
interface Cab1
{
	public void bookCab(String source,String destination);
}

public class Test1 {

	public static void main(String[] args) {
	Cab1 cab = (source,destination)->System.out.println("ola cab is booked from source to destinaton");
    cab.bookCab("bangalore","mumabai");
	}

}
