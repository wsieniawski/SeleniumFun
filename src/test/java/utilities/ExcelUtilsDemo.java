package utilities;

public class ExcelUtilsDemo {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath + "/excel/data.xlsx", "Arkusz1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
}
