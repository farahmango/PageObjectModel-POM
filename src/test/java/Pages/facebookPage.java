package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebookPage {
	WebDriver driver;
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='pass']");
	By login= By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	
	
	public facebookPage(WebDriver driver) {	
		this.driver=driver;
		
	}
	
	public void enterInput(String email, String pass) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(this.email).sendKeys(email);
		driver.findElement(this.pass).sendKeys(pass);
		driver.findElement(login).click();
		
	}
	
	
}
