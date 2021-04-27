package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class link_valid_Test extends TestBase {
	HomePage HomePageObject;
	LoginPage LoginObject;
	String Email="01155452289";

	String password="islam123";
	String link="C:\\Users\\Islam Heshmat\\Downloads\\tenor";

	@Test
	public void usercanlogin()
	{
		HomePageObject = new HomePage(driver);

		
		LoginObject = new LoginPage(driver);
		LoginObject.openloginpage();
		LoginObject.login(Email, password);
//	HomePageObject.assertloginmassage.isDisplayed();

	}
	
	@Test
	public void usercantweetA_link()
	{

		HomePageObject = new HomePage(driver);
		
		LoginObject = new LoginPage(driver);
		LoginObject.openloginpage();
		LoginObject.login(Email, password);
		HomePageObject.phototweet(link);

	}

}
