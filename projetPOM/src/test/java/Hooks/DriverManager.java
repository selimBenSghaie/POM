package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
	
	public static WebDriver driver ; 
	
	public static WebDriver getDrive() {
	
	System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
    driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    
    return driver;

}
}
