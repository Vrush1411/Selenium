package selenium_practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> a=driver.getWindowHandles();
		Iterator <String> b= a.iterator();
		String parentwindow=b.next();
		String childwindow=b.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//span[contains( text(), 'Login')]")).click();
		driver.switchTo().window(parentwindow);
		
		
		

	}

}
