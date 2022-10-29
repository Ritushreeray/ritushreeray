package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.AddtoCart;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;

public class TestCase1 extends BaseClass
//actual TC are execute here
{
	@Test
	public void tc1() 
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.demoapp1();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin (driver);
		driverutilies.switchTab(driver);
		driverutilies.mousehover(driver, sd.getCoursetab());
		sd.seleniumtrng();
		
		AddtoCart ad=new AddtoCart (driver);
		driverutilies.doubleclick(driver, ad.getAddbtn());
		ad.addtocart();
		driverutilies.alertpopup(driver);
	}
}
