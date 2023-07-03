package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class PayKalCheck extends BaseTestCheck {

	@Test
	public void tc01_shop() {
		waiting(5000);

		try {
			String error = driver.findElement(By.cssSelector(".wp-die-message")).getText();
			if (error.contains("באתר זה אירעה שגיאה קריטית.") ) {
				System.out.println("Fail");
				driver.quit();
			}
		} catch (Exception e) {
			waiting(5000);
			System.out.println("Success");
			driver.quit();
		}
	} 
}
