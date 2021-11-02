package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("satyam");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().getText();
//System.out.println(driver.switchTo().alert().getText());
		
		
		
		
		
		
		
		
	}

}
