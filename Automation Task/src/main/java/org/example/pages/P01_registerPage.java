package org.example.pages;

import org.example.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class P01_registerPage {

    public String page_title() {
        String pageTitle = Hooks.driver.getTitle();
        return pageTitle;
    }

    public WebElement account_Btn() {
        return Hooks.driver.findElement(By.cssSelector("label.trig.-df.-i-ctr.-fs16[for='dpdw-login']"));
    }

    public WebElement signIn_btn() {
        return Hooks.driver.findElement(By.partialLinkText("SIGN IN"));
    }

    public WebElement popup_close_btn() {
        return Hooks.driver.findElement(By.cssSelector("button.cls[aria-label='newsletter_popup_close-cta']"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("input_identifierValue"));
    }

    public void wait_to_visible() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(9));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input_identifierValue")));
    }

    public WebElement continue_btn() {
        return Hooks.driver.findElement(By.className("mdc-button--raised"));
    }

    public WebElement createAccount_title() {
        return Hooks.driver.findElement(By.xpath("//h2[text()='Create your account']"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.cssSelector("input[name='password'].password-input"));
    }

    public WebElement getEmail() {
        return Hooks.driver.findElement(By.cssSelector("div.identity-container-username[dir='ltr']"));
    }

    public WebElement confirm_password() {
        return Hooks.driver.findElement(By.cssSelector("input.confirm-password-input"));
    }

    public WebElement continue2_btn() {
        return Hooks.driver.findElement(By.cssSelector("button.mdc-button--touch.to-personal-details"));
    }

    public WebElement personalDetails_title() {
        return Hooks.driver.findElement(By.xpath("//h2[text()='Personal details']"));
    }

    public WebElement firstname() {
        return Hooks.driver.findElement(By.id("input_first_name"));
    }

    public WebElement lastname() {
        return Hooks.driver.findElement(By.id("input_last_name"));
    }

    public WebElement phoneNumber() {
        return Hooks.driver.findElement(By.cssSelector("input.mdc-text-field__input.phone-input"));
    }

    public WebElement continue3_btn() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div/div[2]/div[5]/div/button/span[3]"));
    }

    public WebElement personalDetails2_title() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div/div[3]/div/p"));
    }

    public WebElement gender() {
        return Hooks.driver.findElement(By.cssSelector("div#gender"));
    }

    public WebElement female_gender() {
        return Hooks.driver.findElement(By.cssSelector("li[data-value='F']"));
    }

    public WebElement male_gender() {
        return Hooks.driver.findElement(By.cssSelector("li[data-value='M']"));
    }

    public WebElement selected_gender() {
        return Hooks.driver.findElement(By.cssSelector("input#input_gender"));
    }

    public WebElement DOB()

    {
        return Hooks.driver.findElement(By.id("input_birth_date"));
    }
    public WebElement termsCheckBox()

    {
        return Hooks.driver.findElement(By.id("acceptTC"));
    }
    public WebElement getAccountName()

    {
        return Hooks.driver.findElement(By.cssSelector("div.dpdw._pcent"));
    }

    public WebElement continue4_btn() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div/div[3]/div/div[3]/div[2]/button/span[3]"));
    }













}
