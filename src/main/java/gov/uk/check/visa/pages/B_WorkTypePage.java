package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class B_WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]")
    WebElement selectJobtypeList1;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/label[1]")
    WebElement selectJobtypeList2;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[3]/label[1]")
    WebElement selectJobtypeList3;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[4]/label[1]")
    WebElement selectJobtypeList4;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[5]/label[1]")
    WebElement selectJobtypeList5;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[5]/label[1]")
    WebElement selectJobtypeList6;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[7]/label[1]")
    WebElement selectJobtypeList7;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[8]/label[1]")
    WebElement selectJobtypeList8;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement nextStepButton;

    public void selectJobType(String job) {

        switch (job) {
            case "Health and care professional":
                clickOnElement(selectJobtypeList1);
                break;
            case "Digital technology professional":
                clickOnElement(selectJobtypeList2);
                break;
            case "Academic or researcher":
                clickOnElement(selectJobtypeList3);
                break;
            case "Work in arts or culture":
                clickOnElement(selectJobtypeList4);
                break;
            case "Professional sportsperson":
                clickOnElement(selectJobtypeList5);
                break;
            case "Religious worker":
                clickOnElement(selectJobtypeList6);
                break;
            case "I want to start a business":
                clickOnElement(selectJobtypeList7);
                break;
            case "I want to do another type of job - show me other work visas":
                clickOnElement(selectJobtypeList8);
                break;
            default:
                nextStepButton();
        }
    }

    public void nextStepButton(){
        clickOnElement(nextStepButton);
    }
}
