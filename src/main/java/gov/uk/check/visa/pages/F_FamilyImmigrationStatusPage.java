package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class F_FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/label[1]")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[2]/div[2]/label[1]")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status){
        switch (status){
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;
            default:
                clickNextStepButton();
        }
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }

}
