package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

	@FindBy(css = ".button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
	private WebElement addToCartBtn;

	public ItemPage(WebDriver driver) {
		super(driver);
	}

	public void addToCart() {
		click(addToCartBtn);
	}

}
