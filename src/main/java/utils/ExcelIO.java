package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIO {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelIO(String excelName, String sheetName) throws IOException {
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/" + "test-data/td_users.xlsx");
//		workbook = new XSSFWorkbook(
//				System.getProperty("C:\\Users\\91965\\Downloads\\TrelloDemo(Nadeem)\\CMDS\\test-data") + "/test-data/"
//						+ excelName);
		workbook = new XSSFWorkbook(objfile);
//		objfile = new FileInputStream(System.getProperty("user.dir") + "/" + "test-data");

		sheet = workbook.getSheet(sheetName);
	}

	public int getRowCount() throws IOException {
		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}

	public int getColCount() throws IOException {
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}

	public String getCellDataString(int rowNum, int colNum) throws IOException {
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}

	public double getCellDataNumeric(int rowNum, int colNum) throws IOException {
		Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return cellData;
	}
}
