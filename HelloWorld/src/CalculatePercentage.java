import java.util.Scanner;

public class CalculatePercentage {
	
	
	
	public double calculatePercentage(int marksObtained, int totalMarks) {
        return marksObtained * 100 / totalMarks ;
        
        //int totalMarks = 500;
        //int marksObtained = 395;
    }
 
    public static void main(String[] args) {
    	CalculatePercentage pc = new CalculatePercentage();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter obtained:");
        int marksObtained = in.nextInt();
        
        System.out.println("Enter totalmarks marks:");
        int totalMarks = in.nextInt();
        
        System.out.println("Percentage obtained" + pc.calculatePercentage(marksObtained, totalMarks));
    }
	
}
