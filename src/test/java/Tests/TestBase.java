package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void clickOnMyAccount(){

        driver.get("https://www.hot.net.il/heb/Main/");
        driver.findElement(By.xpath("//*[@id='headerMenu_tab00 ']")).click();
        driver.findElement(By.xpath("//*[@id='headerMenu00']")).click();
        driver.findElement(By.xpath("//a[contains(.,'מבצעי אינטרנט')]")).click();
        driver.findElement(By.id("Obj_linkButton_51")).click();
       
        



    }






@AfterTest (enabled =false)
    public void closeBrowser(){
        driver.close();
}
}
