package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("https://jqueryui.com/draggable/");
		type.manage().window().maximize();
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   type.switchTo().frame(0);
		String gary=type.findElement(By.id("draggable")).getText();
		System.out.println(gary);
		   type.switchTo().defaultContent();
		   
		
	}

}
