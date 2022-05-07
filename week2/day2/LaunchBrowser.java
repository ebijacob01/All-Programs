package week2.day2;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}
}
