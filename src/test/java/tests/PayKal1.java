package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObject.AddToCart;
import pageObject.BillingPage;
import pageObject.CreditPage;
import pageObject.MainPage;


public class PayKal1 extends BaseTest {

	@Test
	public void tc01_shop() {
		MainPage mp = new MainPage(driver);
		mp.agrotPage();

	}
	@Test
	public void tc02_shop1() {
		AddToCart atc = new AddToCart(driver);
		atc.addToCart();
		atc.addProduct();
		waitForElement();
		atc.movePayPage();
	} 
	
	
	@Test
	public void tc03_shop2() {
		BillingPage bp = new BillingPage(driver);
		bp.idLine(123635353);
		bp.nameLine("test");
		bp.lastNameLine("testim");
		bp.addressLine("israel");
		bp.phoneLine("052458698");
		bp.emailLine("test@gmail.com");
		waitForElement();
		bp.checkBoxLine();
		waitForElement();
		bp.moveToPayMent();
	}
		
	@Test
	public void tc04_shop3() {
		//move to frame
		waitForElement();
		WebElement f = driver.findElement(By.cssSelector("#chekout_frame"));
		driver.switchTo().frame(f);
		CreditPage cp = new CreditPage(driver);
		waitForElement();
		cp.numberLine("5326105302332716");
		waitForElement();
		selectByValue(driver.findElement(By.cssSelector("#expYear")), "26");
		waitForElement();
		selectByValue(driver.findElement(By.cssSelector("#expMonth")), "02");
		waitForElement();
		cp.cvvLine("778");
		cp.idLine("890108566");
		waitForElement();
		cp.cancelClick();
		cp.sumbitClick();
//		move back to the main window
		driver.switchTo().defaultContent();
		waitForElement();
		cp.logoPage();
		waitForElement();
	
	} 
	
	@Test
	public void tc05_shop4() {
		waitForElement();
		MainPage mp = new MainPage(driver);
		mp.eventPage();
	}
	
}