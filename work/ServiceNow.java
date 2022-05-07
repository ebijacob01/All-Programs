package work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("https://dev98106.service-now.com/");
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		type.manage().window().maximize();
		type.findElement(By.id("user_name")).sendKeys("admin");
		type.findElement(By.id("user_password")).sendKeys("vOIqreWIwH47");
		type.findElement(By.id("sysverb_login")).click();
		
	}
	
}
