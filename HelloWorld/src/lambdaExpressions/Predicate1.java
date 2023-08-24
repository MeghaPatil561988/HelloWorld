package lambdaExpressions;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args)
	{
		//EX1
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));//true
		System.out.println(p.test(9));//false
		
		//EX2 check the length of given string is greater than 4 or not
		Predicate<String> p1 = s->(s.length()>4);
		System.out.println(p1.test("welcome"));
		System.out.println(p1.test("wel"));
		
		//EX3 print array elements whose size is > 4 from array
		String names[]= {"megha","swapnil","tanu","teju","mithun"};
		for(String name : names) {
			if(p1.test(name)) {
				System.out.println(name);	
			/*if(name.length()>4) {
				System.out.println(name);  same output*/
			}
		}
    }

}
