package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		///these code not able to test----only for learning purpose
		
		driver.get("http://jqueryui.com/droppable");
		
		Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("droggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		
		//now dropping to draggable
		//move from one to another 
		//particular frame only we can drag and drop
		
		action.dragAndDrop(source, target).build().perform();
		
		
		//then we have to comeout from out of the frame container
		
		driver.switchTo().defaultContent();
		
		//using an iframe id we have to manage the frame
		//then index position of the id
		// and using webelement we can handle it
		

	}

}
