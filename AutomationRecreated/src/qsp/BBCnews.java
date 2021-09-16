package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.asm.Advice.Enter;

public class BBCnews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
d.get("https://google.com");
d.manage().window().maximize();
d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("bbc.com"+Keys.ENTER);
d.findElement(By.xpath("//h3[text()='BBC - Homepage']")).click();
List<WebElement> AllLatest=d.findElements(By.xpath("//a[@rev='most-popular|link']"));
int count=AllLatest.size();
for(int i=0;i<count;i++)
{
	WebElement latest=AllLatest.get(i);
	System.out.println(latest.getText());
	System.out.println(AllLatest.get(count-1).getText());
	}
	}

}
