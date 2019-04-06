package Scripts.DataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class DataDrivenTest {
	
	@DataProvider (name = "LoginDetails.xls")
	public Object[] [] getDataFormXLS(){
	Object[][] retObjArr = getTableArray("C:\\Test\\Test\\Resources\\Data\\LoginDetails.xls","Login", "StartAndEnd");
	return retObjArr;
	}
	
   Public String[] [] getTableArray(String xfilepath, String sheetname, String tablename) {
		// TODO Auto-generated method stub
	   String[][] tabArray = null;
	   try {
		   workbook workbook = workbook.getSheet()
		   
	   }
		return null;
	}

@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  
  
}
