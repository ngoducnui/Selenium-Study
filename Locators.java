package Buoi6_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize browser của mình
		driver.manage().window().maximize();
		//driver.get("https://anhtester.com");
		driver.navigate().to("https://sb-heyotrip.hhllglobal.com/");
		
		
		// đối tượng của WebElement
		
		
		WebElement function_hotel = driver.findElement(By.linkText("Hotels"));
		function_hotel.click();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.className("search_going"));
		search.click();
		
	}
}
