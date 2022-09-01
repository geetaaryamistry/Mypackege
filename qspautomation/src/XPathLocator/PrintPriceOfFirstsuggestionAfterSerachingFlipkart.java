package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPriceOfFirstsuggestionAfterSerachingFlipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("laptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	String price = driver.findElement(By.xpath("((//div[@class='_4rR01T'])/ancestor::div[@class='_4rR01T'))");
			}}
