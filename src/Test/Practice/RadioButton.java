package Test.Practice;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception{
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		  driver.get("http://www.echoecho.com/htmlforms10.htm");
		  driver.manage().window().maximize();
		  
	
		  //here using *s* for find because there so we are going to get the size of radio buttons where group belongs to name attribute
		  int a=driver.findElements(By.xpath("//input[@name='group1']")).size();
		 
		  //Printing the size of an attribute name group1
		  System.out.println(a);
		  
		  //using an Collection interface list we also do the same progress
		  List<WebElement> list=driver.findElements(By.xpath("//input[@name='group1']"));
		  System.out.println(list.size());
		  
		  
		  
		//selecting the radio buttons
		  Boolean is_selected=list.get(0).isSelected();
		  
		  if(is_selected==true) {
			  list.get(1).click();
		  } 
		  else if(is_selected==false) {
			  list.get(0).click();
		  }
		  
		  //wait for 5 secs
		  Thread.sleep(500);
		  
		  //checking the group2
		  List<WebElement> l=driver.findElements(By.xpath("//input[@name='group2']"));
		  l.get(1).click();
		  String z=l.get(1).getAttribute("value");
		  if(z.equalsIgnoreCase("Beer")) {
			  System.out.println("Input Condition is valid......");
		  }
		  
		  else {
			  System.out.println("Input condition is not valid......");
		  }
		  
		  //click the all radio buttons in group2 one-by-one
		  
		  System.out.println();
		  System.out.println("Name of group2 attributes");
		  for(int i=0;i<list.size();i++) {
			  l.get(i).click();
			  System.out.print(l.get(i).getAttribute("value")+"  ");
		  }
		  
		  
		  
		  
		  
		  

	}

}
