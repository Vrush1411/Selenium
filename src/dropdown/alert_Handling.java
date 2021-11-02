package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("omkar");
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	driver.switchTo().alert().getText();
	Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
	
		
		
		
		
		
		
		

	}

}
