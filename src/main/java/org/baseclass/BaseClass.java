package org.baseclass;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	private static WebElement e;
	private static String i;
	
	public static WebDriver lauchBrowser(String[] args) {
		return driver;
		
	}
	//browser
	public static WebDriver chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	return driver;
		
	}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
	
	}
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
 }
//url launch
	public static void urllaunch(String url) {
		driver.get(url);
	}
	
	//maximize
	public static void maximize() {
	driver.manage().window().maximize();

	}
		
//implicity
	public static void implicitwait(long secs) {
	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	//sendkeys
	public static void SendKeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void click(WebElement e) {
		e.click();

	}
   public static void SelectByValue(){
	   Select S=new Select(e);
	   S.selectByValue("London");
	

}
	}
	
	
	
	

        
	     


