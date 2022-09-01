package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindoHandle {
		 public static void main(String[] args) throws InterruptedException
		 {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			driver.findElement(By.linkText("open a popup window")).click();
			Thread.sleep(3000);
			driver.quit();
		// TODO Auto-generated method stub

	}

}
rr
