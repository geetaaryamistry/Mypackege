package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Camera under 50000");
		Thread.sleep(2000);
		 List<WebElement> WebElementSuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		 
		// for(int i=0;i<WebElementSuggestion.size();i++)
	//{
	}}