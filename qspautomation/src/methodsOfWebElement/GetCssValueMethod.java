package methodsOfWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement loginButton = driver.findElement(By.id("btnLogin"));
	String property = loginButton.getCssValue("position");
	System.out.println(property);
}
}