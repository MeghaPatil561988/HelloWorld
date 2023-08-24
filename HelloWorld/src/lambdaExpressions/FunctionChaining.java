package lambdaExpressions;

import java.util.function.Function;

public class FunctionChaining {

	/*Function Chaining
	 * andThen()
	 * compose()
	*/
	public static void main(String[] args) {
	
		Function<Integer,Integer> f1 = n->n*2;
		Function<Integer,Integer> f2 = n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2)); //4  64
		
		System.out.println(f1.compose(f2).apply(2)); //8  16 reverse order

	}

}
