package Blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage {

    WebDriver driver;
    By TITLEOFGPAGE = By.xpath("/html/body/div[2]/div/h1");
    By CONFIRMATIONID =By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");

    public ConfirmationPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void getTitleofPage(String ExpectedTitle)
    {
        String Actual=driver.findElement(TITLEOFGPAGE).getText();
        Assert.assertEquals(Actual,ExpectedTitle);
    }

    public String getConfirmationId()
    {
        String CONFIRMATIONID1 =driver.findElement(CONFIRMATIONID).getText();
        Assert.assertNotNull(CONFIRMATIONID1);
        return CONFIRMATIONID1;
    }



}
