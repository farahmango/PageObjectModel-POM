package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearch {
//constructor
	
	WebDriver driver;
	By search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea");
	By button = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
	By facebookBath = By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	By engWebsite = By.xpath("/html/body/div[1]/div[4]/div/div/a");
	
	public googleSearch(WebDriver driver) {
		this.driver = driver;		
	}
	

	public void goToFacebook(String val) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(engWebsite).click();

		driver.findElement(search).sendKeys(val);
		driver.findElement(button).click();
		Thread.sleep(5000);

		driver.findElement(facebookBath).click();
		
	}

}
