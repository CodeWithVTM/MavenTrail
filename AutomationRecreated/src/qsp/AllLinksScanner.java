package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class AllLinksScanner {
private static Scanner sc;
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
System.out.println("Enter The URL");
		sc = new Scanner(System.in);
String url=sc.nextLine();
WebDriver d=new ChromeDriver();
d.get(url);
List<WebElement> AllLinks=d.findElements(By.xpath("//a"));
int count=AllLinks.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
WebElement link=AllLinks.get(i);	
String text=link.getText();
System.out.println(text);
}
d.quit();



	}

}
