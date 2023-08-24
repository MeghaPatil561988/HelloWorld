
public class Averagevalueofintarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] ages = {20, 30, 28, 29, 33,15};
			float total=0;
			
			/*
			for(int i : ages)
			{
				total=total+ages[i];
			}
			float average = total/ages.length;
		    System.out.println(""+average);
            */
          
			
			 for(int i=0; i<ages.length; i++)
			 {
		        	total = total + ages[i];
			 }
			 
			 float average = total/ages.length;     
			    
				System.out.println(""+average);   
	}

	}
