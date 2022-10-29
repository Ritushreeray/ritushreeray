package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot //for pass/fail screenshot
{
	public void getPhoto(WebDriver driver,String name) throws IOException
	{
	Date d=new Date();//for sc for failed vtcs according to current date
	Object currentdate = d.toString().replaceAll(":", "-");//convert to string
	
	TakesScreenshot ts=(TakesScreenshot)driver;//typecasting
	File src = ts.getScreenshotAs(OutputType.FILE);//access the metjod
	File dest=new File(AutoConstant.PhotoPath+currentdate+name+".png");//photopath and pass it for faild tc name and currentdate
	FileUtils.copyFile(src, dest);//copy path
	}
}
