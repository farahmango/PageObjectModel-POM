package TestScenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.facebookPage;
import Pages.googleSearch;

public class TestCases {

	WebDriver driver = new EdgeDriver();
	googleSearch obj = new googleSearch(driver);
	facebookPage obj2 = new facebookPage(driver);
	
	@BeforeTest
	public void beforeTest() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}

	@Test
	public void A_test() throws InterruptedException {
		obj.goToFacebook("facebook");
		
	}
	
	
	@Test
	public void B_tetst() throws InterruptedException {
		obj2.enterInput("farah@gmail.com","pass1254");
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}
	
	
}
