package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

public class E_ReasonForTravelPage extends Utility {

    @CacheLookup
    /*@FindBys({@FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]")})
    List <WebElement> reasonForVisitList;*/
    @FindBys(@FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]"))
    WebElement reasonForVisitList1;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/label[1]")
    WebElement reasonForVisitList2;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[3]/label[1]")
    WebElement reasonForVisitList3;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[5]/label[1]")
    WebElement reasonForVisitList4;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[5]/label[1]")
    WebElement reasonForVisitList5;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[6]/label[1]")
    WebElement reasonForVisitList6;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[7]/label[1]")
    WebElement reasonForVisitList7;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[8]/label[1]")
    WebElement reasonForVisitList8;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[9]/label[1]")
    WebElement reasonForVisitList9;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement nextStepButton;


    public void selectReasonForVisit(String reason) {
        Reporter.log("Clicking on reason tourism");
        /*List<WebElement> reasonList = driver.findElements(By.xpath("//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]"));

            for (WebElement element : reasonList) {
                System.out.println(element);
                //if (element.getText().equalsIgnoreCase(reason)) {
                //if (element.getText().contentEquals(reason)) {
                if (element.getText().equals(reason)) {
                    element.click();
                    break;
            }
        }*/
        if (reason == "Tourism") {
            clickOnElement(reasonForVisitList1);
        } else if (reason == "Work, academic visit or business") {
            clickOnElement(reasonForVisitList2);
        } else if (reason == "Study") {
            clickOnElement(reasonForVisitList3);
        } else if (reason == "Transit (on your way to somewhere else)") {
            clickOnElement(reasonForVisitList4);
        } else if (reason == "Join partner or family for a long stay") {
            clickOnElement(reasonForVisitList5);
        } else if (reason == "Get married or enter into a civil partnership") {
            clickOnElement(reasonForVisitList6);
        } else if (reason == "Stay with your child, if they’re at school") {
            clickOnElement(reasonForVisitList7);
        } else if (reason == "Have medical treatment") {
            clickOnElement(reasonForVisitList8);
        } else if (reason == "For official diplomatic or government business (including transit through the UK)") {
            clickOnElement(reasonForVisitList9);
        }else {
            clickNextStepButton();
        }
    }


    public void clickNextStepButton() {
        Reporter.log("Clicking on continue button");
        clickOnElement(nextStepButton);
    }

}
