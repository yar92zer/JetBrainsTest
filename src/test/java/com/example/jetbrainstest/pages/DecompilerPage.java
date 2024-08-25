package com.example.jetbrainstest.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/decompiler/
public class DecompilerPage {
    WebDriver driver;
    @FindBy(css = "[data-test='button']")
    private WebElement downloadButton;

    public boolean checkIfDownloadButtonIsClickable() {
        System.out.println("Проверка активности кнопки Download");
        return downloadButton.isEnabled();
    }

    public boolean GetDotPeekIsActive() {
        System.out.println("Проверка доступности кнопки 'Get dotPeek'");
        return downloadButton.isEnabled();
    }

    public DecompilerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
