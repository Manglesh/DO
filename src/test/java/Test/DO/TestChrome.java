package Test.DO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestChrome {

	
	public static void main(String s[]) {
		System.setProperty("webdriver.chrome.driver", new File(".").getCanonicalFile()+ "\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		//WebDriver wd= new FirefoxDriver();
        driver.get("https://google.com");
	}
}
