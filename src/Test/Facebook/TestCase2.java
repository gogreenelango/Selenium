package Test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		
		//login with correct UserID and Incorrect Password	
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("elango31031998@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

        //Displaying the wrongPasswordEntered alert in java application
		//using xpath
		String Text=driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
		//using cssSelector
		String Text2=driver.findElement(By.cssSelector("div._4rbf._53ij")).getText();
	    System.out.println(Text);
	    System.out.println(Text2);
	}

}
