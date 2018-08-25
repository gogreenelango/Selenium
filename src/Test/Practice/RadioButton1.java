package Test.Practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
      int a= driver.findElements(By.xpath("//input[@name='group1']")).size();
       System.out.println(a);
      List<WebElement> list=driver.findElements(By.xpath("//input[@name='group1']"));
      System.out.println(list.size());
      Boolean is_selected=list.get(0).isSelected();
      if(is_selected==true)
      {
    	  list.get(1).click();
      }
      else
      {
    	  list.get(0).click();
      }
     
     Thread.sleep(500L);
      for(int i=0;i<a;i++)
      {
    	  driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	 String text= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
    	 System.out.println(text);
    	 if(text.equalsIgnoreCase("Cheese")) {
    		 System.out.println("CORRECT");
    	 }else {
    		 System.out.println("NO");
    	 }
      }
      for(int i=list.size();i<0;i--)
      {
    	  driver.findElements(By.xpath("//input[@name='group2']")).get(0).click();
      }
      List<WebElement> d=  driver.findElements(By.xpath("//input[@name='group2']"));
      d.get(0).click();
     
	}

}
