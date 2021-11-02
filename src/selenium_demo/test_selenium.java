package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_selenium {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//copy the path of chromedriver from seleniumjars
		//import webdriver and chromedriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		//driver.get("https://www.google.com/search?q=amazon&rlz=1C1RXQR_enIN965IN965&oq=ama&aqs=chrome.0.0i131i355i433i512j46i131i199i433i465i512j0i131i433i512j46i199i291i433i512j0i433i512j0i131i433i512j0i433i512j0i457i512j0i402j0i271.2596j0j15&sourceid=chrome&ie=UTF-8");
    System.out.println(driver.getTitle());//checks the title
	System.out.println(driver.getCurrentUrl());//checks or get the url
driver.navigate().back();//goes back
driver.navigate().forward();//opens next page
driver.navigate().refresh();//refreshes browser
driver.close();//closes single browser
	//driver.quit();//closes all open browsers-----interview que-difference between close and quit
	
	}

}

//firefox and internet explorer
