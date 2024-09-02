package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.DecompilerPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecompilerTest extends BaseTest {

    private DecompilerPage decompilerPage;

    @BeforeEach
    @Override
    @Step("Переход в раздел dotPeek")
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/decompiler/");
        decompilerPage = new DecompilerPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки Get dotPeek")
    @Step("Get dotPeek кнопка не активна")
    public void DotPeekIsActive() {
        decompilerPage = new DecompilerPage(getDriver());
        Assertions.assertTrue(decompilerPage.GetDotPeekIsActive(), "Get dotPeek кнопка не активна");
    }

    @Test
    @DisplayName("Проверкаб что конопка скчивание активвна")
    public void buttonCheck() {
        Assertions.assertTrue(decompilerPage.checkIfDownloadButtonIsClickable(), "Кнопка скачивание не активна");
    }
}
