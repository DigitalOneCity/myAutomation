package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {
	WebElement btnLogin = driver.findElement(By.cssSelector(".xoo-wsc-modal"));


	@FindBy(css = ".attachment-woocommerce_thumbnail.size-woocommerce_thumbnail")
	private WebElement addCartBtn;
	@FindBy(css = "[name='add-to-cart']")
	private WebElement addProduct;
	@FindBy(css = ".xoo-wsc-ft-btn.xoo-wsc-ft-btn-checkout")
	private WebElement movePayPage;

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	public void addToCart() {
		click(addCartBtn);
	}

	public void addProduct() {
		click(addProduct);
	}

	public void movePayPage() {
		click(movePayPage);
	}

}
