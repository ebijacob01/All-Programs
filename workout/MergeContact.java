package workout;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		
		Set<String> type=driver.getWindowHandles();
		ArrayList<String> type2=new ArrayList<String>(type);
		driver.switchTo().window(type2.get(1));
		Thread.sleep(4000);
		//List<WebElement> first=driver.findElements(By.xpath("(//a[@class='linktext'])[1]"));
	    
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    Thread.sleep(4000);
	    
		driver.switchTo().window(type2.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Thread.sleep(8000);
		
		driver.switchTo().window(type2.get(1));
		Thread.sleep(6000);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
	    
	    //driver.switchTo().window(type1);
	   
		//driver.findElement(By.className("buttonDangerous")).click();
		
	
				 
		

	}

}
