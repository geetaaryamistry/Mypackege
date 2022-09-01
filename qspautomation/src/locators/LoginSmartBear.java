package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSmartBear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedeiver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.getCurrentUrl("https://app.crossbrowsertesting.com/login");
			driver.findElements("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
			driver.findElement(By.className("lNPNe")).click();
			
			
	}

}
