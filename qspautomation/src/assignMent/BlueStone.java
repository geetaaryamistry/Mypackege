package assignMent;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
	//	Thread.sleep(2000);
		//String window = driver.getWindowHandle();
	//	System.out.println(window);
		driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		Set<String> chatWindow = driver.getWindowHandles();
		//Iterator<String> it = chatWindow.iterator();
		for(String cw:chatWindow)
	System.out.println(cw);
		/*String parnetwindow = it.next();
		String childwindow = it.next();
		System.out.println(parnetwindow);
		System.out.println(childwindow);*/
		
	}

}
