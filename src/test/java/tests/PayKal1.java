package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObject.AddToCart;
import pageObject.BillingPage;
import pageObject.CreditPage;
import pageObject.MainPage;

public class PayKal1 extends BaseTest {

	//	@Test
	//	public void tc01_shop() {
	//		MainPage mp = new MainPage(driver);
	//		mp.eventsPage();
	//		mp.BusinessPromotionPage();
	//		mp.agrotPage();
	//		mp.datPage();
	//		mp.psychologyPage();
	//		mp.micrazimPage();
	//		mp.productsAndServicesPage();
	//		mp.TermsOfUsePage();
	//		mp.siteMapPage();
	//		mp.accessibilityStatementPage();

	//		driver.quit();
	//	}

	@Test
	public void tc02_shop1() {
		MainPage mp = new MainPage(driver);
		mp.datPage();
		AddToCart atc = new AddToCart(driver);
		atc.addProduct();
		waitForElement();
		atc.addToCartPage();
		atc.CartPage();
		atc.moveToPayPage();
		
	} 

	@Test
	public void tc03_shop2() {
		BillingPage bp = new BillingPage(driver);
		bp.idLine(999999998);
		bp.nameLine("test");
		bp.lastNameLine("testim");
		bp.streetLine("bdika");
		bp.postcodeLine(123);
		bp.cityLine("tikva");
		bp.phoneLine("052458698");
		bp.emailLine("hadarm@onecity.co.il");
		waiting(5000);
		bp.termsLine();
		//			bp.checkBoxLine();
		//			waitForElement();
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
		waiting(5000);
		cp.numberLine("5326105302332716");
		waitForElement();
		selectByValue(driver.findElement(By.cssSelector("#expYear")), "26");
		waitForElement();
		selectByValue(driver.findElement(By.cssSelector("#expMonth")), "02");
		waitForElement();
		cp.cvvLine("778");
		cp.idLine("890108566");
		waitForElement();
		cp.sumbitClick();
		//		move back to the main window
		waiting(9000);
		driver.switchTo().defaultContent();
		waiting(5000);
		driver.quit();
	} 

}