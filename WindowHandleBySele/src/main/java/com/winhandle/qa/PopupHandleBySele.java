package com.winhandle.qa;


	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class PopupHandleBySele {
		public static void main(String[] args) throws Exception {
			// set the geckodriver.exe property
			System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\WindowHandleBySele\\Driver\\chromedriver.exe");
			
			 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			// open webpage
			driver.get("https://selenium:webdriver@chercher.tech/auth");
			// verify the title
			if(driver.getTitle().equals("Authentication Successful")){
				driver.get("protocol://Usename:Password@URL Address");
				driver.get("https://selenium:webdriver@chercher.tech/auth");
				System.out.println("Test Passed");
			}else{
				System.out.println("Test failed");
				
			}
		}
	}


