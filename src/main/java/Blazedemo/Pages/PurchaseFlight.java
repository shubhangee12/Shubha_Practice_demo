package Blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchaseFlight {


    WebDriver driver;
    By NAME = By.xpath("//input[@id='inputName']");
    By ADDRESS = By.xpath("//input[@name='address']");
    By CITY = By.xpath("//input[@name='city']");
    By STATE = By.xpath("//input[@name='state']");
    By ZIPCODE = By.xpath("//input[@name='zipCode']");
    By CARDTYPE = By.id("cardType");
    By CREDITCARDNUMBER = By.id("creditCardNumber");
    By CREDITCARDMONTH = By.id("creditCardMonth");
    By CREDITCARDYEAR = By.id("creditCardYear");
    By NAMEONCARD = By.id("nameOnCard") ;
    By REMEMBERME = By.xpath("//input[@id='rememberMe']");
    By PURCHASEFLIGHT = By.xpath("//input[@type='submit' and @value='Purchase Flight']")    ;

    public PurchaseFlight(WebDriver driver)
    {
        this.driver= driver;
    }

    public void Customerdetails(String name,String address,String state,String city,String zipCode)
    {
        driver.findElement(NAME).sendKeys(name);
        driver.findElement(ADDRESS).sendKeys(address);
        driver.findElement(STATE).sendKeys(state);
        driver.findElement(CITY).sendKeys(city);
        driver.findElement(ZIPCODE).sendKeys(zipCode);
    }

    public void CustomerPaymentdetails(String cardtype,String cardnumber,String cardmonth,String cardyear,String cardname)
    {
        Select cardtype1 = new Select(driver.findElement(CARDTYPE));
        cardtype1.selectByValue(cardtype);
        driver.findElement(CREDITCARDNUMBER).sendKeys(cardnumber);
        driver.findElement(CREDITCARDMONTH).sendKeys(cardmonth);
        driver.findElement(CREDITCARDYEAR).sendKeys(cardyear);
        driver.findElement(NAMEONCARD).sendKeys(cardname);

    }

    public void purchaseFlights()
    {
        driver.findElement(PURCHASEFLIGHT).click();
    }

}
