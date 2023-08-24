
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrivateAttributes privateattributes1 =  new PrivateAttributes();
		 PrivateAttributes privateattributes2 =  new PrivateAttributes();
		 
		 PrivateAttributes privateattributes3 =  new PrivateAttributes();
		 PrivateAttributes privateattributes4 =  new PrivateAttributes();
		
		 
		 
		 privateattributes1.setEmployeeId(1001);
		 privateattributes1.setName("Megha");
		 privateattributes1.setDepartment("two");
		 System.out.println( privateattributes1);
		 
		 
		 privateattributes2.setEmployeeId(1002);
		 privateattributes2.setName("Swapnil");
		 privateattributes2.setDepartment("one");
		 System.out.println(privateattributes2);
		 
		 
		 privateattributes3.setEmployeeId(1006);
		 privateattributes3.setName("Me");
		 privateattributes3.setDepartment("five");
		 System.out.println( privateattributes3);
		 
		 privateattributes4.setEmployeeId(1007);
		 privateattributes4.setName("st");
		 privateattributes4.setDepartment("six");
		 System.out.println( privateattributes4);
		 
		  
		  PrivateAttributes[] pa = {privateattributes1,privateattributes2,privateattributes3,privateattributes4} ;
		  for(int i=0;i<pa.length;i++)
		  {
			  System.out.println(""+pa[i]);
		  }
		  
		  
		  
		  
	}

}
