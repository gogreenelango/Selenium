package Test.TimeManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity {
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*Explict
		 * use to halt the excution till the condition is met the particular instance
		 */
		
		
		
		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.flipkart.com/");
		
		//create the wait object
        WebDriverWait wait=new WebDriverWait(driver, 20);
        
   

		
		System.out.println("Page Loadded...");
		driver.navigate().refresh();
		System.out.println(" Again Refreshed....");

		
		
		
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		
		//get the actual value of the title
		String Title2= "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		
		//compare the actual title with the expected title
		if (Title1.equals(Title2))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		
		
		//close browser
		driver.close();
		
		
		
		
		
		
		
	}

}
