package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Parent {
	
	public static Properties metaprop;
	public static WebDriver driver;
	
	public Base_Parent() {
		
		try {
			FileInputStream flise = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\nexttechmeta\\config\\MetaConfig.Properties");
			
			metaprop = new Properties();
			metaprop.load(flise);
		} catch (FileNotFoundException e) {
			System.out.println("Please check you contructor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void metaBrowserinit() {
		
		
		String metaBrowser=  metaprop.getProperty("Brower1");
		
		if(metaBrowser.equalsIgnoreCase("Chrome")) {
			
			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\DriverForChrome\\chromedriver.exe");
				driver= new ChromeDriver();		
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_Data .impicityWait));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_Data .pageLoadWait));
				
			
			}
		else if(metaBrowser.equalsIgnoreCase("FireFox")) {
			
			System.out.println("This is firefox browser");
			
			
			
		}
		
		
	}
	public static void metaLaunchURL(String URL) {
		
		driver.get(metaprop.getProperty("URL1"));
		
		
		
	}
	
	
	
	
	
	

}
