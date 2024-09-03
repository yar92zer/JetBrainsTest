package com.example.jetbrainstest.pages;


import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/decompiler/
public class DecompilerPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DecompilerPage.class));
    WebDriver driver;


    @FindBy(css = ".decompiler-header-section__button.wt-offset-top-32")
    private WebElement DotPeekButton;

    @FindBy(css = ".menu-second__download-button")
    private WebElement downloadButton;

    public boolean checkIfDownloadButtonIsClickable() {
        LOG.info("Проверка активности кнопки Download");
        return downloadButton.isEnabled();
    }

    public boolean GetDotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'Get dotPeek'");
        return downloadButton.isEnabled();
    }

    public DecompilerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
