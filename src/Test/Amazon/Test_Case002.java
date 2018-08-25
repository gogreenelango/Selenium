package Test.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case002 {

	public static void main(String[] args) throws Exception {
		

		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.amazon.in/Power-Your-Subconscious-Mind-Success/dp/8172345666/ref=sr_1_1_sspa?s=books&ie=UTF8&qid=1533555151&sr=1-1-spons&keywords=Books&psc=1&smid=A05378423NJE7Q5XCN3XZ");
		
		//using  thread for the process should be wait for url page load till...if load it will display the display
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();

		Thread.sleep(1000L);
		WebElement t=driver.findElement(By.id("ap_email"));
		t.sendKeys("7373431580");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("7373431580");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		WebElement text=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span"));
		                                                                                           
		System.out.println(text.getText());
		
	}

}
