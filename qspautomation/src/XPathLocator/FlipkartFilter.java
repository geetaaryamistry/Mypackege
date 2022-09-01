package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilter {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	// Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	//Thread.sleep(1000);
	 driver.findElement(By.name("q")).sendKeys("mobiles");
	// Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//Thread.sleep(1000);
driver.findElement(By.xpath("//div[.='Operating System']")).click();


}
}
