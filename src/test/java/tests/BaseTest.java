package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		driver.get("https://paykalstg.wpengine.com/tayibe/");
	} 

	public void waiting(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectByValue(WebElement el , String text) {
		Select s = new Select(el);
		s.selectByValue(text);
	}

	public void waitForElement() {
		waiting(3000);
	}

	public void ClickOnElement(WebElement el){
		el.click();
	}

}
