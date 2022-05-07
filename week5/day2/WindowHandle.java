package week5.day2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("http://www.leafground.com/pages/Window.html");
		type.manage().window().maximize();
		System.out.println(type.getTitle());
		String oldWindow = type.getWindowHandle();
		type.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		Set<String> windowHandles=type.getWindowHandles();
		ArrayList<String> openWindow=new ArrayList<String>(windowHandles);
		type.switchTo().window(openWindow.get(1));
		//type.findElement(By.xpath("//h5[text()='Edit']"));
		type.switchTo().window(openWindow.get(0));
			
	}
}
