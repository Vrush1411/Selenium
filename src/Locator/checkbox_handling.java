package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
       // driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		List<WebElement> obj=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println(obj.size());
		
		for(WebElement a: obj) {
			
		//a.click();
		if(a.getAttribute("value").equalsIgnoreCase("Option2"));
		a.click();
		System.out.println("selected");
		break;
		
		}
		
	List<WebElement>Checkbox=(List<WebElement>) driver.findElement(By.xpath("//input[@type='checkbox']"));
WebElement Element= driver.findElement(By.xpath("//input[@value='option2']"));
	System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).isDisplayed());
	
	

		
		
		
		
	//System.out.println(data.getAttribute("value"));	
	}

}
