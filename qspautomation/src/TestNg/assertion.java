package TestNg;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;







public class assertion {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.get("http://laptop-5goo969n/login.do");

}
	
@Test
public void ActitimeTest(){
	
	String loginpageTitle = driver.getTitle();
	SoftAssert sat = new SoftAssert();
	sat.assertEquals(loginpageTitle,"actiTIME-Login");
	Reporter.log("login verified",true);
	System.out.println("hii");
	
	boolean had = driver.findElement(By.name("username")).isDisplayed();
	System.out.println("hoi");
		Assert.assertEquals(had,true);
		Reporter.log("username",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		boolean pass = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(pass, "manager");
		Reporter.log("Pwd is exist",true);
		sat.assertAll();
		
}}