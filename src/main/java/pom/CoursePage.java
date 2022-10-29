package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage 
{
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="cartArea")
	private WebElement cartArea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	private WebElement linkdinIcon;
	
	
	public CoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCartArea() {
		return cartArea;
	}

	public WebElement getLinkdinIcon() {
		return linkdinIcon;
	}
	
	public void linkdin()
	{
		linkdinIcon.click();
	}
	
}

