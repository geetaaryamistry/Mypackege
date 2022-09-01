package myProgram;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			String title = driver.getPageSource();
					System.out.println(title);
			//driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
			//driver.navigate().to("https://www.youtube.com/watch?v=APRVsl01AZI");
			//Thread.sleep(2000);
	
		//driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		}
}
