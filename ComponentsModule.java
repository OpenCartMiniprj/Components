package openCartMiniPrj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComponentsModule 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\mounika_erri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver w=new ChromeDriver();
	   w.get("http://localhost/opencartpro1/index.php?route=common/home");
	   //Maximizing the window
	   w.manage().window().maximize();
	   Thread.sleep(2000);
	   JavascriptExecutor js=(JavascriptExecutor)w;
	   //Clicking on the components module
	   w.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
	   Thread.sleep(2000);
	   //clicking on Show all components in dropdown list
	   w.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")).click();
	   Thread.sleep(2000);
	   //Clicking on Monitors
	   w.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/li[2]/a")).click();
	   Thread.sleep(2000);
	   //Scrolling
	   js.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(2000);
	   //clicking on the list option
	   w.findElement(By.xpath("//*[@id=\"list-view\"]/i")).click();
	   Thread.sleep(2000);
	   //Adding a product to cart
	   w.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
	   Thread.sleep(2000);
	   //Scrolling
	   js.executeScript("window.scrollBy(0,700)");
	   Thread.sleep(2000);
	   //Selecting the radio button
	   w.findElement(By.xpath("//*[@id=\"input-option218\"]/div[2]/label/input")).click();
	   Thread.sleep(2000);
	   //Selecting the checkbox
	   w.findElement(By.xpath("//*[@id=\"input-option223\"]/div[2]/label")).click();
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"input-option208\"]")).sendKeys("Good");
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"input-option217\"]")).click();
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"input-option217\"]/option[5]")).click();
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"input-option209\"]")).sendKeys("Hello Everyone");
	   Thread.sleep(2000);//Scrolling
	   js.executeScript("window.scrollBy(0,500)");
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	   Thread.sleep(1000);
	   w.close();
	}

}
