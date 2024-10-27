package org.example.appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IntoScreen {
    @AndroidBy(id = "fragOnboardingSkipBtn")
    private WebElement skipButton;

    public boolean checkSkipButton() {
        return skipButton.isEnabled();

    }

    public IntoScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
