package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class country_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
	  Thread.sleep(5000);
	  List<WebElement>element=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	  for(WebElement a: element) {
		  if(a.getText().equalsIgnoreCase("INDIA")) {
			  a.click();
			  break;
		  }
		  
	  }
		
		
		
		
		//driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("India");
		

	}

}
