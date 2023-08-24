import java.util.Arrays;

public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] cities = {"chennai", "kolkata", "mumbai", "pune", "delhi"}; 
		 String cityToFind = "pune";
		 String result="notfound";
		 for (int i=0;i<cities.length;i++) 
		 {
			 
			if(cities[i] == cityToFind ) 
				result=cityToFind+"find existing"+i;
		 }
		
		System.out.println(result);

	}

}
