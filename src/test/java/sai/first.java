package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("rohith");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("rao");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("riouwhdmwdhw@wknd");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0987698765");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		//Thread.sleep(1000);
		Select so=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		//driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		so.selectByVisibleText("September");
		Select so1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));//.click();
		//driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		so1.selectByValue("1997");
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, September 4th, 1997']")).click();
		//driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		//driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		//driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("wertyuioo8765esdf");
		
	}

}