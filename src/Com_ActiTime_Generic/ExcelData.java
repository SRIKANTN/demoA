package Com_ActiTime_Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String file_path,String sheetname,int rn,int cn)
	{
		try
		{
		FileInputStream file = new FileInputStream(new File(file_path));
		String data = WorkbookFactory.create(file).getSheet(sheetname).getRow(rn).getCell(cn).toString();
		return data;
		}
		catch (Exception e)
		{
			return "";
		}
	}
	
	public static int getRowCount(String file_path,String sheetname)
	{
		try
		{
		FileInputStream file = new FileInputStream(new File(file_path));
		int rc = WorkbookFactory.create(file).getSheet(sheetname).getLastRowNum();
		return rc;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
	
	public static int getCellCount(String file_path,String sheetname,int rn)
	{
		try
		{
		FileInputStream file = new FileInputStream(new File(file_path));
		int cc = WorkbookFactory.create(file).getSheet(sheetname).getRow(rn).getLastCellNum();
		return cc;
		}
		catch (Exception e)
		{
			return 0;
		}
	}

}
