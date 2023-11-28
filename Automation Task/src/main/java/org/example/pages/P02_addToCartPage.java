package org.example.pages;

import org.example.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class P02_addToCartPage {

    public WebElement password() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div/div[3]/label/input"));
    }

    public WebElement logIn_btn() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div/div[4]/div[2]/button/span[3]"));
    }
    public WebElement superMarket_item() {
        return Hooks.driver.findElement(By.cssSelector("a.itm"));
    }
    public WebElement Bakery_item() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/a[7]"));
    }
    public WebElement BakeryPage_title() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/section/header/div[1]/h1"));
    }
    public WebElement item1_name() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/section/div[1]/article[1]/a/div[2]/h3"));
    }
    public WebElement item1_price() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/section/div[1]/article[1]/a/div[2]/div[1]"));
    }
    public WebElement item1_addToCart() {
        return Hooks.driver.findElement(By.cssSelector("button.add.btn._prim.-pea._md"));
    }
    public WebElement item2_name() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/section/div[1]/article[2]/a/div[2]/h3"));
    }
    public WebElement item2_price() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/section/div[1]/article[2]/a/div[2]/div[1]"));
    }
    public WebElement item2_addToCart() {
        return Hooks.driver.findElement(By.cssSelector("button.add.btn._prim.-pea._md"));
    }

    public WebElement item1_hover() {
        return Hooks.driver.findElement(By.cssSelector("article.prd._fb.col.c-prd"));
    }
    public WebElement item2_hover() {
        return Hooks.driver.findElement(By.cssSelector("a.core[href='/freska-coated-choco-sticks-24-pcs-30915728.html']"));
    }

    public WebElement cart() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/a"));
    }
    public List<String> shopping_cart_elements() {
        WebElement divElement= Hooks.driver.findElement(By.className("col12"));
        List<WebElement> nameElements = divElement.findElements(By.cssSelector("h3.name"));
        List<String> actualNames = new ArrayList<>();
        for (WebElement nameElement : nameElements) {
            String name = nameElement.getText();
            actualNames.add(name);
        }
        return actualNames;
    }
    public WebElement subTotal() {
        return Hooks.driver.findElement(By.cssSelector("p.-fs20.-plm.-tar"));
    }






}
