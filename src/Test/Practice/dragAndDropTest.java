package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://jqueryui.com/droppable");  
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("droggable")).click();
		
		Actions action=new Actions(driver);
		
		
		WebElement source=driver.findElement(By.id("droggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		
		action.dragAndDrop(source, target).build().perform();
		
	}

}
