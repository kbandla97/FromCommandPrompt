package com.SanityTests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {
	FirefoxDriver driver=null;
@BeforeTest
public void launchBrowser()
{
	driver = new FirefoxDriver();
	System.out.println("Launched Firefox browser");
	
}
@Test
public void doLogin()
{
	driver.get("http://www.gmail.com");
	System.out.println("Logged on to Gmail");
	/*driver.findElement(By.id("//*[@id='identifierId']")).sendKeys("kbkiranbandla@gmail.com");
	driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	driver.findElement(By.name("password")).sendKeys("pass@123");
	driver.findElement(By.id("//*[@id='passwordNext']")).click();*/
}
@AfterSuite
public void closeBrowser()
{
	System.out.println("Closing the Browser");
	driver.quit();
}
}
