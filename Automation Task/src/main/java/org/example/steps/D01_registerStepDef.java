package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.hooks.Hooks;
import org.example.pages.P01_registerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;




public class D01_registerStepDef extends P01_registerPage {

    @Given("user is on Jumia Website")
    public void validatePageTitle() throws InterruptedException {
        String actualPageTitle = page_title();
        String expectedPageTitle = "Jumia Egypt | Best Online Shopping Mall";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        Thread.sleep(2000);
        popup_close_btn().click();
        Thread.sleep(2000);
    }

    @When("user click on account tab then choose signIn")
    public void navigateToSignIn() throws InterruptedException {
        account_Btn().click();
        Thread.sleep(1000);
        signIn_btn().click();
        String actualPageTitle = page_title();
        String expectedPageTitle = "Jumia";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        Thread.sleep(2000);
    }

@And("user enter \"(.*)\"$")
public void enter_email (String email) throws InterruptedException {
    // Wait for the element to be visible
    wait_to_visible();
    email().clear();
    email().sendKeys(email);
    Thread.sleep(2000);
    continue_btn().click();
    Thread.sleep(2000);

}
    @And("user fill \"(.*)\"$")
    public void enter_password (String password) throws InterruptedException {
        String expectedPageTitle = "Create your account";
        Assert.assertEquals(createAccount_title().getText(), expectedPageTitle);
        password().clear();
        password().sendKeys(password);
        Thread.sleep(2000);

    }

    @And("user confirm password \"(.*)\"$")
    public void confirm_password (String confirmPassword) throws InterruptedException {
        confirm_password().clear();
        confirm_password().sendKeys(confirmPassword);
        Thread.sleep(2000);
        continue2_btn().click();
        Thread.sleep(2000);
        String actualTitle= personalDetails_title().getText();
        String expectedPageTitle = "Personal details";
        Assert.assertEquals(actualTitle, expectedPageTitle);

    }
    @And("user type firstname \"(.*)\"$")
    public void first_name (String firstName) throws InterruptedException {
        firstname().clear();
        firstname().sendKeys(firstName);
        Thread.sleep(2000);
    }
    @And("user entered lastname \"(.*)\"$")
    public void last_name (String lastName) throws InterruptedException {
        lastname().clear();
        lastname().sendKeys(lastName);
        Thread.sleep(2000);

    }
    @And("user enter phone number \"(.*)\"$")
    public void phoneNumber (String phoneNumber) throws InterruptedException {
        phoneNumber().clear();
        phoneNumber().sendKeys(phoneNumber);
        Thread.sleep(2000);
        continue3_btn().click();
        Thread.sleep(2000);
        String actualTitle= personalDetails2_title().getText();
        String expectedPageTitle = "Almost there... Just a few more details.";
        Assert.assertEquals(actualTitle, expectedPageTitle);

    }
    @And("user select \"(.*)\"$")
    public void gender (String gender) throws InterruptedException {
        gender().click();

            if(gender.equalsIgnoreCase("female")){
                female_gender().click();
                Thread.sleep(2000);
                String selectedValue = selected_gender().getAttribute("value");
                Assert.assertEquals(selectedValue, "F", "Female option is not selected.");
            }
            else {
                male_gender().click();
                Thread.sleep(2000);
                String selectedValue = selected_gender().getAttribute("value");
                Assert.assertEquals(selectedValue, "M", "Male option is not selected.");

            }
        }

    @And("user select DOB")
    public void DateOfBirth () throws InterruptedException {
         DOB().clear();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Hooks.driver;
        jsExecutor.executeScript("arguments[0].value = '1990-01-01';", DOB());
        Thread.sleep(2000);
        String selectedValue = DOB().getAttribute("value");
        Assert.assertEquals(selectedValue, "1990-01-01", "DOB value is not as expected.");


    }
    @And("user accept terms and conditions then continue")
    public void acceptTerms () throws InterruptedException {
        termsCheckBox().click();
        Thread.sleep(2000);
        boolean isChecked = termsCheckBox().isSelected();
        Assert.assertTrue(isChecked, "Checkbox is not checked.");
        continue4_btn().click();

    }
    @Then("user registered successfully \"(.*)\"$")
    public void validateRegistration (String firstName) throws InterruptedException {
        Thread.sleep(2000);
        String actualName = getAccountName().getText();
        Assert.assertEquals(actualName, "Hi, "+ firstName, "Account Name doesn't match");

    }


    }

