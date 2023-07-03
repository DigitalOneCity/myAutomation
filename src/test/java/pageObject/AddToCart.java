package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {
//	WebElement btnLogin = driver.findElement(By.cssSelector(""));

	@FindBy(css = "body a[href='https://updateplugins1.wpengine.com/product/auto-test/']:last-child")
	private WebElement addProductBtn;
	@FindBy(css = ".single_add_to_cart_button.button.alt.wp-element-button")
	private WebElement addCartBtn;
	@FindBy(css = ".button.wc-forward.wp-element-button")
	private WebElement CartBtn;
	@FindBy(css = ".checkout-button.button.alt.wc-forward.wp-element-button")
	private WebElement moveToPayBtn;
	
	

	public AddToCart(WebDriver driver) {
		super(driver);
	}
	
	public void addProduct() {
		click(addProductBtn);
	}
	
	public void addToCartPage() {
		click(addCartBtn);
	}
	
	public void CartPage() {
		click(CartBtn);
	}

	public void moveToPayPage() {
		click(moveToPayBtn);
	}
	
}
