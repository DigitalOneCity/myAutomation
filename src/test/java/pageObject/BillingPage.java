package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage{


	@FindBy(css = "#onecity_user_id_field")
	private WebElement idbtn;
	@FindBy(css = "#dgwt-wcas-search-input-1")
	private WebElement searchbtn;
	@FindBy(css = "#onecity_user_id_field")
	private WebElement idFiled;
	@FindBy(css = "#billing_first_name")
	private WebElement nameFiled ;
	@FindBy(css = "#billing_last_name")
	private WebElement lastNameFiled ;
	@FindBy(css = "#billing_address_1")
	private WebElement addressFiled ;
	@FindBy(css = "#billing_phone")
	private WebElement phoneFiled  ;
	@FindBy(css = "#billing_email")
	private WebElement emailFiled ;
	@FindBy(css = "#terms")
	private WebElement checkBoxBtn ;
	@FindBy(css = "#place_order")
	private WebElement payMentBtn ;


	public BillingPage(WebDriver driver) {
		super(driver);
	}

	public void searchLine(String name) {
		fillText(searchbtn, name);
	}

	public void idLine(int num) {
		fillNum(idFiled, num);
	}

	public void nameLine(String name) {
		fillText(nameFiled, name);
	}

	public void lastNameLine(String name) {
		fillText(lastNameFiled, name);
	}

	public void addressLine(String name) {
		fillText(addressFiled, name);
	}

	public void phoneLine(String num) {
		fillText(phoneFiled, num);
	}

	public void emailLine(String name) {
		fillText(emailFiled, name);
	}

	public void checkBoxLine() {
		checkBoxBtn.click();
	}

	public void moveToPayMent() {
		payMentBtn.click();
	}

}
