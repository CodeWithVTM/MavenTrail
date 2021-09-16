package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AllSuggCapture {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Url");
String URL=sc.next();
WebDriver d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
d.get(URL);   
d.findElement(By.name("q")).sendKeys("qspiders");
List<WebElement> AllLinks=d.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
int count=AllLinks.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
WebElement link=AllLinks.get(i);	
String text=link.getText();
System.out.println(text);
}
AllLinks.get(count-1).getText();
AllLinks.get(count-1).click();


}

}
