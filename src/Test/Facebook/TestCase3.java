package Test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//sign up the facebook
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("sathish");
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("8667358132");
		driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("12345Elango&");
		
        Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        s1.selectByValue("1");//Differnet way of using select method
        Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        s2.selectByIndex(6);
        Select s3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        s3.selectByVisibleText("2017");
        
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        
        /*By choosing radio button based on the number of size we have to select them
         * either male or female
         * code......
         * if(count>0) {
		driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
	}
         */
        
        driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
        
        //then verification code will be send to either PhoneNumber or EmailId
        
        
        
        
	}

}
