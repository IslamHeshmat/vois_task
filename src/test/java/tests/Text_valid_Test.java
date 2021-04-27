package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Text_valid_Test extends TestBase{


	HomePage HomePageObject;
	LoginPage LoginObject;

	String Email="eslamheshmat528@gmail.com";
	String password="0163083151";
	String tweettext="hello islam";
	
	@Test
	public void usercanlogin()
	{
		HomePageObject = new HomePage(driver);
		
		LoginObject = new LoginPage(driver);
		LoginObject.openloginpage();
		LoginObject.login(Email, password);
//	HomePageObject.assertloginmassage.isDisplayed();

	}
	
	@Test(dependsOnMethods = {"usercanlogin"} )
	public void usercantweet()
	{
	
		HomePageObject = new HomePage(driver);
		HomePageObject.tweet(tweettext);
	

	}
}
