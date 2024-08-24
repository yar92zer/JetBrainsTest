package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.DecompilerPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecompilerTest extends BaseTest {

    private DecompilerPage decompilerPage;
    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/decompiler/");
        decompilerPage = new DecompilerPage(getDriver());
    }

    @Test
    @DisplayName("Проверкаб что конопка скчивание активвна")
            public void buttonCheck(){
        assertTrue(decompilerPage.checkIfDownloadButtonIsClickable(),"Кнопка скачивание не активна");
    }
}
