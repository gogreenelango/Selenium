package Test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		
		//login with correct with Postive UserId and Passwrod
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("elango31031998@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("************");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	
		

	}

}
