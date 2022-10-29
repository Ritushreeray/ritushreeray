package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CoursePage;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		SkillraryLoginPage sp=new SkillraryLoginPage(driver);
		sp.gearsbtn();
		sp.demoapp1();
		
		SkillraryDemoLogin sd= new SkillraryDemoLogin(driver);
		driverutilies.switchTab(driver);
		driverutilies.dropdown(sd.getCourseadd(),pdata.getData("courseadd"));
		
	CoursePage cp=new CoursePage(driver);
	driverutilies.draganddrop(driver, cp.getSelenium(),cp.getCartArea());
	WebElement loc = cp.getLinkdinIcon();
	Point l = loc.getLocation();
	int x=l.getX();
	int y=l.getY();
	driverutilies.scrollbar(driver, x, y);
	Thread.sleep(5000);
	
	cp.linkdin();
		
	}
}
