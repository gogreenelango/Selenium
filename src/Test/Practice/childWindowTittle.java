package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class childWindowTittle {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"js_0\"]/ul/li[10]/a")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		String ParentId=itr.next();
		//here we are getting the child window tittle
		String ChildId=itr.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());		
		
		
		
		
	}

}
