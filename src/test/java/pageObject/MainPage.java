package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-cd8d3fb")
	private WebElement agrotBtn;
	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-a1b0173")
	private WebElement eventBtn;
	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-06b697a")
	private WebElement menuimBtn;
	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-53e2225")
	private WebElement rechesBtn;
	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-a79a9f6")
	private WebElement michrazBtn;
	@FindBy (css=".elementor-column.elementor-col-16.elementor-inner-column.elementor-element.elementor-element-cd7c0e6")
	private WebElement handasaBtn;



	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void agrotPage() {
		ClickOnElement(agrotBtn);
		//		driver.navigate().back();
	}

	public void eventPage() {
		click(eventBtn);
//		driver.navigate().back();
	}

	public void menuimPage() {
		click(menuimBtn);
		driver.navigate().back();
	}

	public void rechesPage() {
		click(rechesBtn);
		driver.navigate().back();
	}

	public void michrazPage() {
		click(michrazBtn);
		driver.navigate().back();
	}

	public void handasaPage() {
		click(handasaBtn);
		driver.navigate().back();
	}
	
	
}
