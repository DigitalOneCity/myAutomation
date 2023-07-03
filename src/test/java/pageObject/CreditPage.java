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
//	@FindBy(css = "#expYear")
//	private WebElement selectYearBtn ;
//	@FindBy(css = "#expMonth")
//	private WebElement selectMonthBtn ;
	@FindBy(css = "#submitBtn")
	private WebElement sumbitBtn ;
//	@FindBy(css = "")
//	private WebElement cancelBtn ;
//	@FindBy (css="")
//	private WebElement logoBtn;


	public CreditPage(WebDriver driver) {
		super(driver);
	}

	public void numberLine(String num) {
		fillText(numberFiled, num);
	}

	public void cvvLine(String num) {
		fillText(cvvFiled, num);
	}
	
	public void idLine(String num) {
		fillText(idFiled, num);
	}

	public void sumbitClick() {
		sumbitBtn.click();
	}

//	public void cancelClick() {
//		cancelBtn.click();
//	}

//	public void logoPage() {
//		click(logoBtn);
//		
//	}
}
