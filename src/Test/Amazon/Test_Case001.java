package Test.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case001 {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		//Enter the Data in search field and use Keyboard value Enter
		WebElement w=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		w.sendKeys("Book");
		w.sendKeys(Keys.ENTER);
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"result_18\"]/div/div/div/div[2]/div[1]/div[1]"));
	    String Text=w1.getText();
	    w1.click();
	    System.out.println(Text);
	    
	    
	    
	    
	    try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    
	    
		driver.close();
	    
	    
	    
   	
		
		
		
		
		
		
		
		
   		
   		
   		
	}

}
