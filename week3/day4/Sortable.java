package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("http://www.leafground.com/pages/sortable.html");
		type.manage().window().maximize();
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement type1=type.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement type2=type.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions name=new Actions(type);
		name.c
		
	}

}


















