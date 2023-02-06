package org.vcdoctor.pagesmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.vcdoctor.login.InitiateBrowser;

import java.io.IOException;

public class LoginPage {

    WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
    }


    public void getLoginButton() {
        webDriver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[9]/a[1]")).click();

    }

    public void withPassword() {
        webDriver.findElement(By.xpath("//*[@id=\"btnPassword\"]")).click();

    }

    public void enterCode(String countryCode) {
        webDriver.findElement(By.xpath("//*[@id=\"select2-CountryCode-container\"]")).click();

    }

    public void enterUsername(String username) {
        webDriver.findElement(By.name("UserName")).sendKeys(username);
    }

    public void enterPassword(String password) throws IOException {
        webDriver.findElement(By.name("Password")).sendKeys(password);

    }

    public void login() throws IOException {
        webDriver.findElement(By.xpath("//*[@id=\"LoginForm\"]/div[6]/button[1]")).click();

    }

    public void clickOnMenus() throws InterruptedException {
        for (int i = 1; i <= 12; i++) {
            String link = "/html/body/div[1]/main/div/div[1]/aside/ul/li[" + i + "]/div/a";
            String heading = "/html/body/div[1]/main/div/div[2]/div[2]/div[1]/h4";
            System.out.println(link);

            if (i == 1) {
//                            String dashboardLink = "//*[@id=\"side-menu\"]/ul/li[1]/div/a";
                webDriver.findElement(By.xpath(link)).click();
                Thread.sleep(5000);
                String element = webDriver.findElement(By.xpath(heading)).getText();
                System.out.println(element);
                if (element.toLowerCase() == "Welcome To ORGANIZATION ADMIN DASHBOARD".toLowerCase()) {
                    System.out.println("page is working");
                } else {
                    System.out.println("page is not working");
                }
                Thread.sleep(1000);
            } else if (i == 2) {
                Thread.sleep(5000);
                String element = webDriver.findElement(By.xpath(link)).getText();
                System.out.println(element);

                if (element.contains("Manage Info")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println("page is working");
                } else {
                    System.out.println("page is not working");
                }

            } else if (i == 3) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText();
                System.out.println(element);

                if (element.contains("Manage Locations")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println("page is working");
                } else {
                    System.out.println("page is not working");
                }
            } else if (i == 4) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("staff management")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 5) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("manage patient")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 6) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("archive patient")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 7) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("transaction log")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 8) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("patient document")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 9) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("staff document")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 10) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("audit log")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 11) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("enterPassword log")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
                }
            } else if (i == 12) {
                Thread.sleep(2000);
                String element = webDriver.findElement(By.xpath(link)).getText().toLowerCase();
                System.out.println(element.toLowerCase());

                if (element.contains("cms content")) {
                    webDriver.findElement(By.xpath(link)).click();
                    System.out.println(element + " page is working");
                } else {
                    System.out.println(element + " page is not working");
//                            }

                }
            }
        }
    }
}

