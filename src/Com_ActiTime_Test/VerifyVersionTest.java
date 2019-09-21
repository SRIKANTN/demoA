package Com_ActiTime_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Page.actiTIMELoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority=3)
	public void VerifyVersion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		String eversion = ExcelData.getData(file_path, "TC03", 1, 0);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		lp.VerifyTitle(title);
		String aversion = lp.verifyVersion();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aversion, eversion);
		Reporter.log("version "+aversion,true);
		sa.assertAll();
	}

}
