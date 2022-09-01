package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way3Syntex1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.selenium.dev/");
		String text=driver.findElement(By.xpath("//h4[contain(@class,'Selenium WebDriver')]")).getText();
		System.out.println(text);
	
	}

}
