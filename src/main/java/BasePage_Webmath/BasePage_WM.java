package BasePage_Webmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage_WM {
	
	
	
	public static WebDriver driver; 
	public static Properties prop; 
		
		
	public void Initialization() { 
	 String ConfigPath="./src/main/java/Config_WM/WebMath.Properties";
	 FileInputStream FIS  ;
	
		try {
			FIS = new FileInputStream(ConfigPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	 prop= new Properties();
	 
		try {
			FIS = new FileInputStream(ConfigPath);
			prop.load(FIS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver(options);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 driver.get(prop.getProperty("url"));
	 
	 
	 
   }
	
  public void TearDown() {
		driver.quit();
		}
}
	

