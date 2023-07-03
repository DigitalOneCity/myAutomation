package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {
	Actions actions = new Actions(driver);


	@FindBy (css="[class^='elementor-flip']>[name='main_events']")
	private WebElement eventsBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_business']")
	private WebElement BusinessPromotionBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_agrot']")
	private WebElement agrotBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_dat']")
	private WebElement datBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_psychology']")
	private WebElement psychologyBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_micrazim']")
	private WebElement micrazimBtn;
	@FindBy (css="[class^='elementor-flip']>[name='main_productsAndServices']")
	private WebElement productsAndServicesBtn;
	@FindBy (css=".main_futer>li:nth-child(1) > a")
	private WebElement TermsOfUseBtn;
	@FindBy (css=".main_futer>li:nth-child(2) > a")
	private WebElement siteMapBtn;
	@FindBy (css=".main_futer>li:nth-child(3) > a")
	private WebElement accessibilityStatementBtn;
	//	@FindBy (css="")
	//	private WebElement searchBtn;


	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void eventsPage() {
		actions.moveToElement(eventsBtn).perform();
		actions.click().perform();
		driver.navigate().back();
	}

	public void BusinessPromotionPage() {
		actions.moveToElement(BusinessPromotionBtn).perform();
		actions.click().perform();
		driver.navigate().back();
	}

	public void agrotPage() {
		actions.moveToElement(agrotBtn).perform();
		actions.click().perform();
		driver.navigate().back();
	}

	public void datPage() {
		click(datBtn);
//		driver.navigate().back();
	}

	public void psychologyPage() {
		click(psychologyBtn);
		driver.navigate().back();
	}

	public void micrazimPage() {
		click(micrazimBtn);
		driver.navigate().back();
	}

	public void productsAndServicesPage() {
		click(productsAndServicesBtn);
		driver.navigate().back();
	}

	public void TermsOfUsePage() {
		click(TermsOfUseBtn);
		driver.navigate().back();
	}

	public void siteMapPage() {
		click(siteMapBtn);
		driver.navigate().back();
	}

	public void accessibilityStatementPage() {
		click(accessibilityStatementBtn);
		driver.navigate().back();
	}

	//	public void searchPage() {
	//		click(searchBtn);
	//	}

}
