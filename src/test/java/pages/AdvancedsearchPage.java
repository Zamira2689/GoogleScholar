package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdvancedsearchPage {

    public AdvancedsearchPage (){

        PageFactory.initElements(Driver.get(),this);
    }

@FindBy(xpath = "//span[normalize-space()='Advanced search']")
    public WebElement advancedSearch;

    @FindBy(xpath = "//input[@id='gs_asd_q']")
    public WebElement sendKeys;

    @FindBy(xpath = "//button[@id='gs_asd_psb']//span[@class='gs_wr']")
    public WebElement buttonadvanced;
}
