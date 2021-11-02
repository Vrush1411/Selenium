package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("mumbai");
		List<WebElement> element=(List<WebElement>) driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]"));
		for(WebElement b: element) {
			//String currentoption= b.getText();
			if(b.getText().equalsIgnoreCase("MUMBAI"))
					{
			b.click();
			break;
			
					}
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
