package org.vcdoctor.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.vcdoctor.Configuration;
import org.vcdoctor.pagesmodel.LoginPage;

import java.io.IOException;

public class LoginTest extends InitiateBrowser {

    @Test(dataProvider = "loginExcel", dataProviderClass = Configuration.class)
    public void getLogin(String countryCode, String name, String pass) throws InterruptedException, IOException {
        LoginPage page = new LoginPage(webDriver);
        page.getLoginButton();
        Thread.sleep(4000);
        page.withPassword();
        Thread.sleep(5000);
        page.enterCode(countryCode);
        Thread.sleep(5000);
        page.enterUsername(name);
        Thread.sleep(5000);
        page.enterPassword(pass);
        Thread.sleep(5000);
        page.login();
        Thread.sleep(4000);
        page.clickOnMenus();
        Thread.sleep(5000);
    }
}
