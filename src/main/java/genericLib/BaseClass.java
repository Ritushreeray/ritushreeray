package genericLib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass //this class used for open and close the app
{
	public WebDriver driver;
	public PropertyFileData pdata=new PropertyFileData();//globally declaire PropertyFileData class for access
	public WebDriverutilities  driverutilies=new WebDriverutilities();//globally declare ref variable for utilities
	
	@BeforeMethod
	
		public void openApp() throws IOException
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//launch the browser
			driver.manage().window().maximize();
			String url;
			driver.get(pdata.getData("url"));
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//version 3so syntax
			
		}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();//quit all application
	}
	

	}

