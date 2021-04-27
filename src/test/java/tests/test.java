package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class test extends TestBase{

	@Test
	public void sendtext()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	WebElement login=	(WebElement) driver.findElements(By.xpath("//input[@name='session[username_or_email]']"));
	login.sendKeys("01155452289");
	
	WebElement password=	(WebElement) driver.findElements(By.name("\"session[password]\""));
	password.sendKeys("islam123");
	driver.findElement(By.xpath("//div[@class='css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1fz3rvf r-usiww2 r-1pl7oy7 r-snto4y r-1ny4l3l r-1dye5f7 r-o7ynqc r-6416eg r-lrvibr']//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-rjixqe r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")).click();
	driver.findElement(By.cssSelector("div[class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")).sendKeys("hey");
	
	}
	
}
