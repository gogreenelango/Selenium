package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.amazon.com/");
		Actions action= new Actions(driver);
		Thread.sleep(1000L);
		
		
		//moving an cursor to paticular field
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountlist']"));
		action.moveToElement(move).build().perform();
		
		
		//moves to specific element and using sendkeys post the data in UpperCase and using doubeClick select the data
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
		
		

	}

}
