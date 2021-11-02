package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiocheckbox_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		//radio.findElement(By.xpath("//input[@value='radio2']")).click();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
