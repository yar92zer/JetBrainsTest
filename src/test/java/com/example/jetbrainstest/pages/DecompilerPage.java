package com.example.jetbrainstest.pages;


import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.AllureLoggerCustom;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/decompiler/
public class DecompilerPage {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(DecompilerPage.class));
    WebDriver driver;


    @FindBy(css = ".decompiler-header-section__button.wt-offset-top-32")
    private WebElement DotPeekButton;

    @FindBy(css = ".menu-second__download-button")
    private WebElement downloadButton;

    @Step("Кнопка Download активна")
    public boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки Download");
        return downloadButton.isEnabled();
    }
    @Step("Кнопка 'Get dotPeek' доступна")
    public boolean getDotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'Get dotPeek'");
        return downloadButton.isEnabled();
    }

    public DecompilerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
