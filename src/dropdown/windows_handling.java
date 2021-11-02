package dropdown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> a=driver.getWindowHandles();//will return parent window and child window
		Iterator<String> b=a.iterator();
		String parentwindow =b.next();//to store parent window
		String childwindow =b.next();//to store child window
		driver.switchTo().window(childwindow);//it will switch control to the childwindow
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.switchTo().window(parentwindow);//it will switch back control to the parentwindow
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		

	}

}





/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows*/