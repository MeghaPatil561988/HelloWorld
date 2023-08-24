package filehandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvDemo {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\Megha\\eclipse-workspace\\HelloWorld\\src\\UserAccounts.csv";
		FileReader filereader = new FileReader(filePath);
		BufferedReader br=new BufferedReader(filereader);
		while(br.ready())
        {
			String line = br.readLine();
			System.out.println(line);
			
		    }

	}

}
