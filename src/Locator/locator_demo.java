package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_demo {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	//locator id
		driver.findElement(By.id("username")).sendKeys("demo1");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("signup")).click();
		driver.findElement(By.id("Login")).click();
	//linktext
		//Thread.sleep(5000);
	driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();//run programm if only one word "forgot" is given
	//contents x-path
		//syntax=
			//	"//tagname[contains(text()'value')]	" value= eg= try for free,forgot password//only for click functions
		
		
		
		
		
		
		
	}
}
