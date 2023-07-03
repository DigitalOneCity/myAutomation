package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage{


//	@FindBy(css = "")
//	private WebElement idbtn;
//	@FindBy(css = "")
//	private WebElement searchbtn;
	@FindBy(css = "[name='onecity_user_id_field']")
	private WebElement idFiled;
	@FindBy(css = "#billing_first_name")
	private WebElement nameFiled ;
	@FindBy(css = "#billing_last_name")
	private WebElement lastNameFiled ;
	@FindBy(css = "#billing_address_1")
	private WebElement streetFiled ;
	@FindBy(css = "#billing_postcode")
	private WebElement postcodeFiled ;
	@FindBy(css = "#billing_city")
	private WebElement cityFiled ;
	@FindBy(css = "#billing_phone")
	private WebElement phoneFiled  ;
	@FindBy(css = "#billing_email")
	private WebElement emailFiled ;
//	@FindBy(css = "#recaptcha-anchor")
//	private WebElement checkBoxBtn ;
	@FindBy(css = "#terms")
	private WebElement termsBtn ;
	@FindBy(css = "#place_order")
	private WebElement payMentBtn ;
	
	
	

	public BillingPage(WebDriver driver) {
		super(driver);
	}

//	public void searchLine(String name) {
//		fillText(searchbtn, name);
//	}

	public void idLine(int num) {
		fillNum(idFiled, num);
	}

	public void nameLine(String name) {
		fillText(nameFiled, name);
	}

	public void lastNameLine(String name) {
		fillText(lastNameFiled, name);
	}
	
	public void streetLine(String name) {
		fillText(streetFiled, name);
	}
	
	public void postcodeLine(int num) {
		fillNum(postcodeFiled, num);
	}
	

	public void cityLine(String name) {
		fillText(cityFiled, name);
	}

	public void phoneLine(String num) {
		fillText(phoneFiled, num);
	}

	public void emailLine(String name) {
		fillText(emailFiled, name);
	}

//	public void checkBoxLine() {
//		checkBoxBtn.click();
//	}
	
	public void termsLine() {
		termsBtn.click();
	}

	public void moveToPayMent() {
		payMentBtn.click();
	}

}
