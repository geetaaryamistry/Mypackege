package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Kaushik/Desktop/HTML/disabledelement.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('i1').value='admin'");
		driver.findElement(By.id("i1")).sendKeys("admin");
		
	}


}
