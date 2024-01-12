package javaPackage;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.logging.Logger;

public class Log4jlogin {

	public static void main(String[] args) {
		//create a logger instance
		//Logger logger =Logger.getLogger("Log4jlogin");
		//configure log4j properties file
		//PropertyConfigurator.configure("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\log4j.properties");
		//open browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

	}

}
