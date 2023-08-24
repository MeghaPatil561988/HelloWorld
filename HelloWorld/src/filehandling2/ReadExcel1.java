package filehandling2;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel1 
{
	 public static void main(String[] args) throws Exception 
	 {
	        String filePath = "C:\\Users\\Megha\\eclipse-workspace\\HelloWorld\\practise.xlsx";    
	       
	            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
	            
	            int numberOfRows = workbook.getSheet("Sheet1").getLastRowNum();
	            for(int i=1;i<=numberOfRows;i++) 
	            {
	            String name = workbook.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	            String gender = workbook.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
	            System.out.println("Name:"+name);
	            System.out.println("Gender:"+gender);
	  
	            }
	    }
	        
}	    
	  


