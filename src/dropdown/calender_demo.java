package dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> date= driver.findElements(By.xpath("//td[@class='day']"));
	for(int i=0; i<date.size(); i++) {
		String value= date.get(i).getText();
		if (value.equalsIgnoreCase("26")) {
			date.get(i).click();
			Thread.sleep(5000);
			break;
			
		}}
			
		
	//\"https://www.path2usa.com/travel-companions\");"
	
	}

}
