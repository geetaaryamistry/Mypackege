package assignMent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findsuggestion {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	List<WebElement> wb = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
	//list<WebElement> wb = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
	//wb.sendKeys("bike");
/*	for(int i=0;i<wb.size();i++)
	{
	 WebElement s = wb.get(i);
	 String sug = s.getText();
	 System.out.println(sug);
	}*/
	
}


}
