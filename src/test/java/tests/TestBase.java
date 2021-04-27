package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional ("firefox")String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"/resources/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"/resources/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"/resources/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
	}
	/*@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}*/
}
