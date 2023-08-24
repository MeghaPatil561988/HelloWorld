package Strings;

import java.util.Scanner;

public class StringOp {

	public static void main(String[] args)
	{
	String s1,s2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 strings");
	
    s1=sc.nextLine();
    s2=sc.nextLine();
    
    String s3;
    s3= s1+s2;   //s1.concat(s2); 
    System.out.println("result of concatination : " + s3);
    
    int l1 = s1.length();
    int l2 = s2.length();
    
    System.out.println("s1 length " + l1);
    System.out.println("s2 lengt " + l2);
    
    s1=s1.toUpperCase();
    System.out.println("s1 in upeercase" +s1);
    
	}
	

}
