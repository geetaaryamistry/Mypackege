package singleSelectDropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Kaushik/Desktop/HTML/singleselectdropdown.html");
		//Thread.sleep(2000);
		WebElement ssdropdown = driver.findElement(By.id("menu"));
		Select sel=new Select(ssdropdown);
		sel.selectByIndex(5);
		
	}

}