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

public class UtilsExcel 
{
	
	
	private DataFormatter formatter=new DataFormatter();
	
	public Object[][] getdetails() throws IOException {
	File file=new File("E:\\\\Excel\\\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb= new XSSFWorkbook(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	int rowcount=sheet.getLastRowNum();
	

	String array[][] = new String[rowcount][2];
	for (int r = 1; r < rowcount; r++) {
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


	
	/*//define all required variable above at begning itself.
   public FileInputStream fis;
   public FileOutputStream fos;
   public XSSFWorkbook workbook;
   public XSSFSheet sheet;
   public XSSFRow row;
   public XSSFCell cell;
   public CellStyle style;
   String path=null;
   
   //Constructor is made here and its function is to whenever i create an object (Utils_Excel) for this class. We have to pass the location of file.
   // So this constructor take the path of file, and assign the path to local variable i.e(   String Path=null;), so it is a class variabe.

  public UtilsExcel(String path)
   {
	   this.path=path;
   }
   
   //Now get the code for RowCount
   
   public int getRowCount(String sheetName) throws IOException
   {
	   fis=new FileInputStream(path);
	   workbook = new XSSFWorkbook(fis);
	   sheet = workbook.createSheet(sheetName);
	   
	   int rowCount=sheet.getLastRowNum();
	   workbook.close();
	   fis.close();
	   return rowCount;
	   
   }
   
   // Now get code for CellCount
   
   public int getCellCount(String sheetName, int rowNum) throws IOException
   {
	   fis= new FileInputStream(path);
	   workbook = new XSSFWorkbook(fis);
	   sheet=workbook.createSheet(sheetName);
	   
	   row= sheet.getRow(rowNum);
	   int cellcount=row.getLastCellNum();
	   workbook.close();
	   fis.close();
	   return cellcount;
	   	   
   }
   
   //Now get code for GettingCellData
   public String getCellData(String sheetName, int rownum, int colnum) throws IOException 
   {
	   fis =new FileInputStream(path);
	   workbook=new XSSFWorkbook(fis);
	   sheet= workbook.createSheet(sheetName);
	   
	   row=sheet.getRow(rownum);
	  // cell=row.getCell(colnum);
	   cell=row.getCell(colnum);
	   DataFormatter formatter=new DataFormatter();
	   String data;
	   try {
		   data= formatter.formatCellValue(cell);
	   }
	   catch(Exception e)
	   {
		   data="";
	   }
	   workbook.close();
	   fis.close();
	   return data;
	   */
  
	/*
	 * // Now get the code for Providing the values to excel from eclipse public
	 * void setCelData(String sheetName, int rownum, int colnum, String data) throws
	 * IOException { row=sheet.createRow(rownum); cell=row.getCell(colnum);
	 * cell.setCellValue(data);
	 * 
	 * fos= new FileOutputStream(path); workbook.write(fos); workbook.close();
	 * fis.close(); fos.close();
	 * 
	 * }
	 * 
	 * // Now get the code for Giving Colour In Excel File like... Green or Red
	 * public void FillGreenColor(String sheetName, int rownum, int colnum) throws
	 * IOException { row=sheet.createRow(rownum); cell=row.createCell(rownum);
	 * 
	 * style=workbook.createCellStyle();
	 * style.setFillForegroundColor(IndexedColors.RED.getIndex());
	 * style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	 * cell.setCellStyle(style); workbook.write(fos); workbook.close(); fis.close();
	 * fos.close(); }
	 */
