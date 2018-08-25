package Test.Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

public static void main(String[] args) {

int sum=0;

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();



driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");


//Here using an Table element to attain a value of Scoreboard paticular value of rows and coulumns
WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));



//Iniziliaze the count total rows in a table
//how we wre from ptant to child
int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
//print the total rows of the count
System.out.println(count);

//getting the score of each player and add runs in sum
for(int i=0;i<count-2;i++)
{
String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
System.out.println(value);
int valueinteger=  Integer.parseInt(value);
sum=sum+valueinteger;//103
}
System.out.println(sum);


//Extras are given by  Oppenent Team
String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
int extrasValue=Integer.parseInt(Extras);
int TotalSumValue=sum+extrasValue;
System.out.println(TotalSumValue);

//Toatl runs scored by an team
//sibiling transverse
String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
int ActualTotalVAlue=Integer.parseInt(ActualTotal);
if(ActualTotalVAlue==TotalSumValue)
{
	
System.out.println("Count Matches");
}
else
{
System.out.println("count fails");
}
}

}

