package Blazedemo.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LandingPage {


        WebDriver driver;
        By TITLEOFPAGE = By.xpath("/html/body/div[2]/div/h1");
        By DEPCITY = By.name("fromPort");
        By DESTCITY = By.name("toPort");
        By FINDFLIGHT = By.xpath("//input[@type='submit' and @value='Find Flights']");
        By HOME = By.xpath("/html/body/div[1]/div/div/a[3]");

        public LandingPage(WebDriver driver)
        {
            this.driver = driver;

        }

        public void getTitleofPage(String ExpectedTitle)
        {

            String ActualTitle= driver.findElement(TITLEOFPAGE).getText();
            Assert.assertEquals(ActualTitle, ExpectedTitle);

        }

        public void SelectDepCity(String DEPCITY1)
        {

            Select SelDepCity = new Select(driver.findElement(DEPCITY));
            try {
                SelDepCity.selectByValue(DEPCITY1);
            }
            catch (NoSuchElementException exp1)
            {
                System.out.println("Location does not exist");
            }
        }

        public void SelectDestCity(String DESTCITY1)
        {


            Select SelDestCity = new Select( driver.findElement(DESTCITY));
            try {
                SelDestCity.selectByValue(DESTCITY1);
            }
            catch (NoSuchElementException exp2)
            {
                System.out.println("Location does not exist");
            }
        }

        public void FindFlights()
        {
            driver.findElement(FINDFLIGHT).click();
        }


    }


