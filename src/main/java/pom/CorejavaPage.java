package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage 
{
	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
	private WebElement corejava;
	 
	public CorejavaPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void corejavaCourse()
	{
		corejava.click();
	}
	
}
