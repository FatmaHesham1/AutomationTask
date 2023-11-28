package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.hooks.Hooks;
import org.example.pages.P02_addToCartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class D02_addToCartStepDef extends P02_addToCartPage {

private static String item1_name;
private static String item2_name;
private static String  item1_price;
private static String  item2_price;
@And("user enter password \"(.*)\"$")
public void enter_password (String password) throws InterruptedException {
    password().clear();
    password().sendKeys(password);
    Thread.sleep(2000);
    logIn_btn().click();
    Thread.sleep(2000);

}
    @And("user hover on supermarket item then click on bakery")
    public void selectBakery () throws InterruptedException {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(superMarket_item()).perform();
        Thread.sleep(2000);
        Bakery_item().click();
        Thread.sleep(2000);
        String actualTitle= BakeryPage_title().getText();
        String expectedPageTitle = "Bakery";
        Assert.assertEquals(actualTitle, expectedPageTitle);

    }
    @And("user add two items to the cart")
    public void addItemsToTheCart() throws InterruptedException {
        item1_name=item1_name().getText();
        item1_price= item1_price().getText();
        item2_name= item2_name().getText();
        item2_price= item2_price().getText();
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(item1_hover()).perform();
        // Scroll the page to bring the button into view
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView();", item1_hover());
        // Wait for the "Add To Cart" button to be clickable
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        // Click on the "Add To Cart" button
        js.executeScript("arguments[0].click();", item1_addToCart());
        Thread.sleep(2000);
        actions.moveToElement(item2_hover()).perform();
        js.executeScript("arguments[0].scrollIntoView();", item1_hover());
        WebDriverWait wait2 = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        js.executeScript("arguments[0].click();", item2_addToCart());
        Thread.sleep(2000);


    }
    @Then("verify that items and prices are successfully added")
    public void verify_addToCart_Items () throws InterruptedException {
        cart().click();
        Thread.sleep(2000);
        List<String> actualNames=shopping_cart_elements();
        List<String> expectedNames = Arrays.asList(item1_name, item2_name);
        assert actualNames.equals(expectedNames) : "Element names do not match the expected names.";
        String item1_price_1 = item1_price.replace("EGP", "").trim();
        String item1_price_2 = item2_price.replace("EGP", "").trim();
        float item1_price_float= Float.parseFloat(item1_price_1);
        float item2_price_float= Float.parseFloat(item1_price_2);
        float expected= item1_price_float + item2_price_float ;
        String text= subTotal().getText();
        String numberString = text.replace("EGP", "").trim();
        float actual = Float.parseFloat(numberString);
        Assert.assertEquals(actual, expected);
    }

    }

