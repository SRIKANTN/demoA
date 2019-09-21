package Com_ActiTime_Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	public static void getScreenShot(WebDriver driver,String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src, new File("./ScreenShot/"+name+".png"));
		} 
		catch (IOException e)
		{
		}
	}
	public static void selectByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
				
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element ,String text)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
		
	}
}
