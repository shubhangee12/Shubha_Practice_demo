package Blazedemo.Test;

import Blazedemo.Pages.ChooseFlight;
import Blazedemo.Pages.ConfirmationPage;
import Blazedemo.Pages.LandingPage;
import Blazedemo.Pages.PurchaseFlight;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtendedScenarios extends FlightBookingTest {

    @Test
    public void Booking_verify_landingpageTitle() {
        obj_LandingPage = new LandingPage(driver);
        obj_LandingPage.getTitleofPage("Welcome to the Travel Agency!");

    }

    @Test
    public void VerfiyDeptCity() {
        obj_LandingPage = new LandingPage(driver);
        obj_LandingPage.SelectDepCity("TEST");

    }


    @Test
    public void VerfiyDestCity() {
        obj_LandingPage = new LandingPage(driver);
        obj_LandingPage.SelectDestCity("TEST");

    }




}