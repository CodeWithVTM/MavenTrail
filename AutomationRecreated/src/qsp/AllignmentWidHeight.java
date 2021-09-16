package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentWidHeight {
	static {
		System.setProperty("webdriver.chrome.driver", "Z:\\JAVA FILES\\Automation\\driver\\chromedriver.exe");
	}

public static void main(String[] args) {
WebDriver d=new ChromeDriver();
d.get("https://www.naukri.com/");
int H1=d.findElement(By.xpath("//input[@placeholder='Enter Locations…']")).getSize().getHeight();
int H2=d.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']")).getSize().getHeight();
if(H1==H2)
{
System.out.println("Height is same");
	}
else {
	System.out.println("Height is Not same");
}
d.quit();
}
}
