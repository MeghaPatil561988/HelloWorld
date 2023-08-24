import java.util.Arrays;

public class Givenelementexistinthearrayornot {

	public static void main(String[] args) {
	
		int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
		int salaryToFind = 55000;
		
		Arrays.sort(salaries);
		System.out.println("sorted array");
		 for (int num : salaries) {
	         System.out.print(num+" ");
	         
	         System.out.println("Enter the value to be searched: ");
	         
	         int retVal = Arrays.binarySearch(salaries,salaryToFind);
	         
	         System.out.println("Element found");
	         System.out.println("The index of element in the sorted array: " + retVal);
	      }
	}

}
