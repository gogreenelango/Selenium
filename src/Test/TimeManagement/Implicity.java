package Test.TimeManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicity {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		    //here the wait webdriver to poll the DOM trying to find Element or Wait to load available
		
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
			driver.findElement(By.id("H-destination")).sendKeys("nyc");
			driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
			driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
	
			
			

			driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
	



}}
