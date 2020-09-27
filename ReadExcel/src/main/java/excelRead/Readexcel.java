package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static Map<String, String> getLocatorInfo() throws IOException {
		Map<String, String> testData = new HashMap<String, String>();

		try {
			FileInputStream fis = new FileInputStream("C://Users//Karthik//eclipse-workspace//ReadExcel//src//test//resources//excelutils//Book1.xlsx");

			Workbook workbook = new XSSFWorkbook(fis);
			Sheet locators = workbook.getSheetAt(0);
			int lastRowNumber = locators.getLastRowNum();

			for (int i = 0; i <= lastRowNumber; i++) {
				Row row = locators.getRow(i);
				Cell keycell = row.getCell(0);
				String key = keycell.getStringCellValue().trim();
				Cell valuecell = row.getCell(1);
				String value = valuecell.getStringCellValue().trim();
				testData.put(key, value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return testData;

	}
}
