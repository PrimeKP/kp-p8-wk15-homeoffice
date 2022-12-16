package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class A_StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startButton;


    //===========================methods=======================================

    public void clickStartNow() {
        Reporter.log("Clicking on start now button");
        clickOnElement(startButton);
    }


}
