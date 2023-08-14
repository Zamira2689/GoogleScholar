package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

   public HomePage (){

       PageFactory.initElements(Driver.get(),this);
   }

   @FindBy(css = "#@id=gs_hdr_hp_lgo")
    public WebElement pageTitle;
   // @FindBy(xpath = "//img[@id='gs_hdr_hp_lgo']")
   // public WebElement pageTitle;

   @FindBy(css="#gs_hdr_tsi")
    public WebElement searchBox;

    @FindBy(css = "button[id='gs_hdr_tsb'] span[class='gs_ico']")
    public WebElement searchButton;

    @FindBy(css = "#gs_res_ccl")
    public List<WebElement> page;
}
