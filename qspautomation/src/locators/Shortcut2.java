package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shortcut2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//to login
	driver.findElement(By.cssSelector("input[id$='ername']")).sendKeys("Admin");
	//passing ending characters of id value in cssSelector locator
	
	
}
}