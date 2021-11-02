package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_checkbox {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		//to select single element
		List<WebElement> radio=driver.findElements(By.xpath("//input[@class='radioButton']"));
		for(WebElement a:radio) {
			a.click();
		System.out.println(a.getAttribute("value"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
