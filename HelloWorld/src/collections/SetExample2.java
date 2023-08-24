package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import beans.Product;

public class SetExample2
{

	public static void main(String[] args) 
	{
		public static void displaySetOfProducts(Set<Product> setOfProducts) 
		{
			    Product product1 = new Product(1,"Mobile",60000);
				Product product2 = new Product(1,"Chair",60000);		
				Product product3 = new Product(1,"Table",60000);
				
				Set<Product> p= new HashSet<Product>();
				p.add(product1);
				p.add(product2);
				p.add(product3);
				
				
				private static void displaySetOfStrings(Set<String> setOfString) 
				{
					for(Product p : setOfProducts)
					{
						System.out.println(p);
					}
	           }
			
		}

	}

}
