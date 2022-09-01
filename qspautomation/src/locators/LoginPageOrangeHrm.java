package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//span[text{}=( Username : Admin | Password : admin123 )]")).sendKeys("Admin");
}

	}