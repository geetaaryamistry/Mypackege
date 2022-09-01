package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateThroughFiltersPrintFirstSuggestion 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//clicked on cross button to close that login page dialoug box
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");//typed laptop in search box
	//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(…
}}
