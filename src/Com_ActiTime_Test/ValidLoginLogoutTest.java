package Com_ActiTime_Test;

import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Page.actiTIMEEnterTimeTrackPage;
import Com_ActiTime_Page.actiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void ValidLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgtitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hptitle = ExcelData.getData(file_path, "TC01", 1, 3);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		//to verify login page title
		lp.VerifyTitle(lgtitle);
		//to enter user name
		lp.EnterUserName(un);
		//enter password
		lp.EnterPassword(pw);
		//click on login button
		lp.ClickOnLoginButton();
		// to verify home page title
		lp.VerifyTitle(hptitle);
		hp.clickOnLogoutButton();
		//to verify login page title
		lp.VerifyTitle(lgtitle);
	}
}
