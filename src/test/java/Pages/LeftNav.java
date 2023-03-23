
package Pages;

import Utilities.GWD;
import javafx.scene.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public WebElement CitizenShip;
//sol taraftaki menüler burada

    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);

    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    public void clickFunction(WebElement setup) {
    }
}



