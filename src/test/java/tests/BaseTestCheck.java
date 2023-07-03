package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTestCheck {
	WebDriver driver;

	@BeforeClass
	protected void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://paykaldev.wpengine.com/sajur");	
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
