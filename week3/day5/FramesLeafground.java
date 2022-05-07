package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesLeafground {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("http://www.leafground.com/pages/frame.html");
		type.manage().window().maximize();
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    type.switchTo().frame(0);
		WebElement gary=type.findElement(By.id("Click"));
		gary.click();
		String muthu=gary.getText();
		System.out.println(muthu);
		type.switchTo().defaultContent();
		
		type.switchTo().frame(1);
		type.switchTo().frame(0);
		WebElement radha=type.findElement(By.id("Click1"));
		radha.click();
		String radha1=radha.getText();
		System.out.println(radha1);
		
		WebElement eng=type.findElement(By.tagName(""))
		
		
		
		
		
		
	}

}
