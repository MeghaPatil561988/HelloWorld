package Strings;

import java.io.IOException;

public class UserInput {

	public static void main(String[] args) throws IOException {
		int i = System.in.read();
		System.out.println((char)i);

		
		String str="";
		while((i=System.in.read())!=48) {
			str=str+(char)i;
		}
		System.out.println(str);
	}

}
