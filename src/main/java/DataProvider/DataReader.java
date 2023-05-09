package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataReader {
	
	private final DataFormatter formatter=new DataFormatter();
	
	
	public Object[] [] getdetails() throws IOException {
		File file = new File("C:\\Users\\Admin\\Documents\\Testing\\Test case.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Data");
		int rowcount=sheet.getPhysicalNumberOfRows()-1;
		

		String array[][] = new String[rowcount][2];
		for (int r = 1; r < sheet.getPhysicalNumberOfRows(); r++) {
			for (int c=0; c<sheet.getRow(r).getLastCellNum(); c++) {
				Row row=sheet.getRow(r);
				if(row!=null) {
					Cell cell=row.getCell(c);
					if(cell!=null) {
						String value=formatter.formatCellValue(cell);
						array [r-1] [c]= value;
					}
				}
			}
			System.out.println();

		}
		return array;

	}
	
}
