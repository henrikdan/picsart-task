import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static WebElement waitForElement(WebDriver driver,WebElement element, int seconds) {
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,seconds); 
		
		WebElement e = wait.until(ExpectedConditions.visibilityOf(element));
		return e;
		
	}
	
}
