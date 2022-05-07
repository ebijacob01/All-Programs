package serviceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://signon.service-now.com/x_snc_sso_auth.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Ebinazer321@gmail.com");
		driver.findElement(By.id("sign_in_username_btn")).click();
		driver.findElement(By.name("current-password")).sendKeys("Jacob@123");
		driver.findElement(By.className("sso_auth_cta")).click();
		
		
	}

}
