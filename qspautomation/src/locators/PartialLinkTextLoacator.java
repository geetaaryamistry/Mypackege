package locators;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLoacator 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=p2w4gmxpabke");
    driver.findElement(By.partialLinkText("here")).click();					
    System.out.println("Title of page is: " + driver.getTitle());							
    driver.quit();			
}		
}
