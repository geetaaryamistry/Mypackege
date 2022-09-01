package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.calculator.net/");
     driver.findElement(By.xpath("//span[@onclick='r(1)'and .='1']")).click();
     driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
     driver.findElement(By.xpath("//span[@onclick='r(0)'and .='5']")).click();
     driver.findElement(By.xpath("//span[.='+'and @class='sciop']")).click();
      driver.navigate().refresh();
      //to refresh
   
	}
}