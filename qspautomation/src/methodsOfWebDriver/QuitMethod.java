package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod 
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.linkText("open a popup window")).click();
	Thread.sleep(3000);
	driver.quit();
}
}


//In this program not automatically opening the link "Open a popup window" and quiting from both parent and child window