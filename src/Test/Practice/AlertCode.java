package Test.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCode {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

		System.out.println(driver.switchTo().alert().getText());

		//sometimes alert give popup like user need enter the value
		//whether we can use below step
		//driver.switchTo().alert().sendKeys("fesfe");

		
		//Accepting an response ok done
		driver.switchTo().alert().accept(); 
		
		//dismising the alert
		//driver.switchTo().alert().dismiss();
		
   
	}

}
