package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

	@FindBy(css = "")
	private WebElement addToCartBtn;

	public ItemPage(WebDriver driver) {
		super(driver);
	}

	public void addToCart() {
		click(addToCartBtn);
	}

}
