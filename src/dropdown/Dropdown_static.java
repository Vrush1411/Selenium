package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_static {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement abc= driver.findElement(By.xpath("//select[id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown=new Select(abc);
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		dropdown.selectByValue("INR");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("USD");
	//	System.out.println(dropdown.getFirstSelectedOption().getText());\
		
		
		
	}

}
