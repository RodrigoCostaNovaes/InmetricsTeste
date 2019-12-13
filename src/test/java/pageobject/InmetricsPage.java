package pageobject;

import org.openqa.selenium.By;

import factory.WebDriverFactory;

public class InmetricsPage  extends WebDriverFactory{
	
	

	
	public InmetricsPage acessaUrl() {
	    WebDriverFactory.startChromeDriver();
		return this;
		
	}
	
	public InmetricsPage ClickBotãoCarreira() {
		driver.findElement(By.id("linkcarreiras")).click();
		return this;
	}
	
	public InmetricsPage Frame() {
		driver.switchTo().frame(driver.findElement(By.id("ytplayer")));
		return this;
	}
	public InmetricsPage ClickBotãoConfiraVagas() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='https://inmetrics.gupy.io']")).click();
		return this;
	}
	
	

}
