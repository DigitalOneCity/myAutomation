package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreditPage extends BasePage {
	@FindBy(css = "#Track2CardNo")
	private WebElement numberFiled ;
	@FindBy(css = "#cvv")
	private WebElement cvvFiled ;
	@FindBy(css = "#personalId")
	private WebElement idFiled ;
	@FindBy(css = "#Track2CardNo")
	private WebElement sendBtn ;
	@FindBy(css = "#expYear")
	private WebElement selectYearBtn ;
	@FindBy(css = "#expMonth")
	private WebElement selectMonthBtn ;
	@FindBy(css = "#submitBtn")
	private WebElement sumbitBtn ;
	@FindBy(css = "#cancelBtn")
	private WebElement cancelBtn ;
	@FindBy (css=".elementor-element.elementor-element-5e491455")
	private WebElement logoBtn;


	public CreditPage(WebDriver driver) {
		super(driver);
	}

	public void numberLine(String num) {
		fillText(numberFiled, num);
	}

	public void cvvLine(String num) {
		fillText(cvvFiled, num);
	}

	public void sendClick() {
		sendBtn.click();
	}

	public void sumbitClick() {
		sumbitBtn.click();
	}

	public void cancelClick() {
		cancelBtn.click();
	}

	public void idLine(String num) {
		fillText(idFiled, num);
	}
	
	public void logoPage() {
		click(logoBtn);
		
	}
}
