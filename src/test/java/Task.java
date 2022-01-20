import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class Task {
	
	private static final Logger logger = LoggerFactory.getLogger(Task.class);
	
	@Test(retryAnalyzer = Retry.class)
	//picsart
	public void test0() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		

		driver.get("https://picsart.com/gold");
		driver.findElement(By.xpath("//*[@id=\"header-desktop\"]/div/div[1]/a/img")).click();

		logger.debug(null);
		driver.close();
	}	

	@Test(retryAnalyzer = Retry.class)
	//blog
	public void test1() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://picsart.com/");
		driver.findElement(By.xpath("//*[@id=\"header-desktop\"]/div/div[2]/nav/div[5]/strong")).click();
		driver.findElement(By.xpath("//*[@id=\"header-desktop\"]/div/div[2]/nav/div[5]/div/div/div[2]/div/a")).click();

    	logger.debug(null);
		driver.close();
	}	


	@Test(retryAnalyzer = Retry.class)
	//designSchool
	public void test2() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://picsart.com/blog");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[1]/a")).click();
		driver.close();

		logger.debug(null);
	}	


	@Test(retryAnalyzer = Retry.class)
	//trends
	public void test3() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

    	driver.get("https://picsart.com/blog");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[2]/a")).click();
		driver.close();

		logger.debug(null);
	}	

	@Test(retryAnalyzer = Retry.class)
	//picsartPro
	public void test4() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://picsart.com/blog");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[3]/a")).click();
		driver.close();

		logger.debug(null);
	}	

	@Test(retryAnalyzer = Retry.class)
	//news
	public void test5() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://picsart.com/blog");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[4]/a")).click();
    	driver.close();

    	logger.debug(null);


	}
	
	@Test(retryAnalyzer = Retry.class)
	//search
	public void test6() {
		logger.debug(null);
		System.setProperty("webdriver.chrome.driver", "\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 

		driver.get("https://picsart.com/blog/category/trends");
		
		WebElement search = driver.findElement(By.className("search-form-searchInput-0-2-134"));
		
		Wait.waitForElement(driver, search, 10).sendKeys("wild horses");                                                       //smart wait
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div/div[2]/div/form/button")).click();
		
		logger.debug(null);
		driver.close();


	}
	
	
	


}

