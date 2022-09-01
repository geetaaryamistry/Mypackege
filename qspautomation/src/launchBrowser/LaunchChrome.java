package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
 public static void main(String[] args)
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//(key,value)//relative path is given here which is shortest path
	  new ChromeDriver();
 }
}