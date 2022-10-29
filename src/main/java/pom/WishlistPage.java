package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage 
{
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbutn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebutn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closepopup;
	
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton()
	{
		playbutn.click();
	}
	
	public void pausebutton()
	{
		pausebutn.click();
	}
	
	public void addWishlist()
	{
		wishlist.click();
	}
	public void closePop()
	{
		closepopup.click();
	}
}
