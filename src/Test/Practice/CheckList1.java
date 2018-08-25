package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckList1 {
	
	public static void main(String[] args) {
		
	

		     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		
		
			driver.get("http://spicejet.com/");

		    //checking the checkbox is selected or not to check the condition using isSelected command
			System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

			driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

			System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

			driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

			System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

			

	
	}

}
