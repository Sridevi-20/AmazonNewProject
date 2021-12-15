package amazonProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTheProduct {
		public static void main(String[] args) throws InterruptedException {
			        // Set up Chrome driver
					System.setProperty("webdriver.chrome.driver", "D:/Selenium_SoftWares/Selenium_Softwares/drivers/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					//launch the Chrome browser and direct it to the Base URL
					driver.get("https://www.amazon.com/");
					String window = driver.getWindowHandle();
					//Maximize the window
					driver.manage().window().maximize();
					WebElement searchbutton=driver.findElement(By.id("twotabsearchtextbox"));
					searchbutton.clear();
					//Enter the product name
					searchbutton.sendKeys("ipad");
					WebElement searchsubmitbutton=driver.findElement(By.id("nav-search-submit-button"));
					//Click on the search icon
					searchsubmitbutton.click();
					WebElement productname=driver.findElement(By.linkText("2021 Apple 10.2-inch iPad (Wi-Fi, 64GB) - Space Gray"));
					//click on the product name
					productname.click();
					WebElement addcartbutton=driver.findElement(By.id("add-to-cart-button"));
					//click on add cart button
					addcartbutton.click();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					//Click the No thanks button
					driver.findElement(By.xpath("//span[@id='attachSiAddCoverage']/following-sibling::span")).click();
					driver.quit();
					
					
		}

	}


