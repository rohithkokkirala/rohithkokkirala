package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d1 {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromiumdriver().create();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("//input[@id='firstName']")).sendKeys("rohith");
		driver.findElement(By.id("//input[@id='lastName']")).sendKeys("shruthi");
		driver.findElement(By.id("//input[@id='userEmail']")).sendKeys("rohithshrithi@gmail.com");
		driver.findElement(By.id("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("//input[@id='userNumber']")).sendKeys("110120210409199724031998");
		driver.findElement(By.id("//input[@id='dateOfBirthInput']")).clear();
		Select rs=new Select(driver.findElement(By.id("//select[@class='react-datepicker__month-select']")));
				rs.selectByValue("8");


	}

}
