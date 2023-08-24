package collections;

import java.util.ArrayList;
import java.util.List;

import beans.Product;

public class ListExample2 {

	public static void main(String[] args) {
		        Product product1 = new Product(1,"Mobile",60000);
				Product product2 = new Product(1,"Chair",60000);		
				Product product3 = new Product(1,"Table",60000);
				
				List<Product> p= new ArrayList<Product>();
				p.add(product1);
				p.add(product2);
				p.add(product3);
				
				for(Product p : listOfProducts)
				{
					System.out.println(p);
				}

	}

}
