package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CorejavaPage;
import pom.SkillraryLoginPage;
import pom.WishlistPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage sl=new SkillraryLoginPage(driver);
		sl.searchtextbox(pdata.getData("search"));
		sl.searchbutton();
		
		CorejavaPage cj=new CorejavaPage(driver);
		driverutilies.switchTab(driver);
		cj.corejavaCourse();
		
		WishlistPage wp=new WishlistPage(driver);
		wp.closePop();
		driverutilies.switchtoframe(driver);
		Thread.sleep(5000);
		
		wp.playbutton();
		Thread.sleep(5000);
		
		wp.pausebutton();
		driverutilies.switchback(driver);
		wp.addWishlist();
	}
	
	
}
