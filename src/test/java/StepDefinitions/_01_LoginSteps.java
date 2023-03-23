package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _01_LoginSteps {
    DialogContent dc=new DialogContent();//her metoddan okusun diye en başa yazdık
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        // System.out.println("Merhaba 1");
        GWD.getDriver().get("https://test.mersys.io/%22");
                GWD.getDriver().manage().window().maximize();// bunu silince bende hata veriyo

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        //  WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        //  wait.until(ExpectedConditions.visibilityOf(dc.username));
        //  dc.username.sendKeys("turkeyts");
        // dc.password.sendKeys("TechnoStudy123");
        // dc.loginButton.click();

        dc.sendKeysFunction(dc.username,"turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123" );
        dc.clickFunction(dc.loginButton);
    }
    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy,"Techno Study");
    }
}