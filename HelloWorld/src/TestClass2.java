
public class TestClass2 {

	public static void main(String[] args) 
	{
	
		PrivateAttributes pa1 = new PrivateAttributes(2001,"megha","three");
		//System.out.println(pa1);
		
		PrivateAttributes pa2 = new PrivateAttributes(2002,"megh","five");
		PrivateAttributes pa3 = new PrivateAttributes(2003,"meghas","three");
		
		PrivateAttributes[] ae = {pa1,pa2,pa3};
		/*for(int i=0;i<ae.length;i++)
		{
			PrivateAttributes pa = ae[i]; 
			System.out.println(pa);
		}*/

 for(PrivateAttributes pa:ae)
 {
 System.out.println(pa);
 }
 
 

	}

}
