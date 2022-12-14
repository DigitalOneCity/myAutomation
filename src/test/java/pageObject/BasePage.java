package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
	protected WebDriver driver;
	protected WebDriver clickOnElemen;


	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillText(WebElement el , String text) {
		el.clear();
		el.sendKeys(text);
	}

	public void fillNum(WebElement el , int num) {
		el.sendKeys(String.valueOf(num));
	}

	public void click(WebElement el) {
		el.click();
	}


	public String getText(WebElement el) {
		return el.getText();
	}

	public void selectByValue(WebElement el , String text) {
		Select s = new Select(el);
		s.selectByValue(text);
	}

	public void waiting(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForElement(WebElement el) {
	}


	public void ClickOnElement(WebElement el){
		waitForElement(el);
		el.click();
	}

}

