package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//not understood this Program
public class DeselectByIndexValue {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Kaushik/Desktop/HTML/singleselectdropdown.html");
		WebElement msd = driver.findElement(By.id("menu"));
		Select sel=new Select(msd);
		sel.selectByValue("v3");
		Thread.sleep(5000);
	    sel.deselectByValue("v3");

	}

}