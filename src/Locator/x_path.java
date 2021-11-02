package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");//have to give everytime
		// X-Path syntax
		   //tagname[@attribute='value']
		//input[@id='username']    //validate the x-path using "ctrl=F"
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demouser");
		
		
//css selector syntax
		 //tagname[attribute='value']    remove"// & @"
//input[id='username']
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("adress");
		//use for login
		
		//driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("omsam");
     driver.findElement(By.xpath("(//form[@name='login']//input)[23]")).sendKeys("1234");
		
		
	}

}
