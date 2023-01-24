package org.vcdoctor.login;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    ChromeDriver chromeDriver;

    @Test
    public void getLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://vcclinic.ukitss.com/");
        chromeDriver.findElementByXPath("//*[@id=\"main-nav\"]/li[9]/a[1]").click();
        chromeDriver.findElementByXPath("//*[@id=\"btnPassword\"]").click();
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\Khushboo\\vc_doctor_automation\\data.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int rowcount = 1;
            for (Row row : sheet) {
                List<Object> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    rowData.add(cell.getStringCellValue());
                    rowcount++;
                }
                WebElement countryElement = chromeDriver.findElementByXPath("//*[@id=\"select2-CountryCode-container\"]");
                countryElement.click();
                Thread.sleep(5000);
                String username = row.getCell(1).getStringCellValue();
                WebElement webElement = chromeDriver.findElementByXPath("//*[@id=\"UserName\"]");
                webElement.sendKeys(username);
                Thread.sleep(5000);
                String password = row.getCell(2).getStringCellValue();
                WebElement webElements = chromeDriver.findElementByXPath("//*[@id=\"Password\"]");
                webElements.sendKeys(password);
                Thread.sleep(10000);
                chromeDriver.findElementByXPath("//*[@id=\"LoginForm\"]/div[6]/button[1]").click();
                Thread.sleep(5000);
                for (int i = 1; i <= 12; i++) {
                    String link = "/html/body/div[1]/main/div/div[1]/aside/ul/li[" + i + "]/div/a";
                    String heading = "/html/body/div[1]/main/div/div[2]/div[2]/div[1]/h4";
                    System.out.println(link);
                    try {
                        if (i == 1) {
                            String dashboardLink = "/html/body/div[1]/main/div/div[2]/div[2]/div/div/div[1]";
                            chromeDriver.findElement(By.xpath(dashboardLink)).click();
                            Thread.sleep(5000);
                            String element = chromeDriver.findElementByXPath(heading).getText();
                            System.out.println(element);
                            if (element.toLowerCase() == "Welcome To ORGANIZATION ADMIN DASHBOARD".toLowerCase()) {
                                System.out.println("page is working");
                            } else {
                                System.out.println("page is not working");
                            }
                            Thread.sleep(1000);
                        } else if (i == 2) {
                            Thread.sleep(5000);
                            String element = chromeDriver.findElementByXPath(link).getText();
                            System.out.println(element);

                            if (element.contains("Manage Info")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println("page is working");
                            } else {
                                System.out.println("page is not working");
                            }

                        } else if (i == 3) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText();
                            System.out.println(element);

                            if (element.contains("Manage Locations")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println("page is working");
                            } else {
                                System.out.println("page is not working");
                            }
                        } else if (i == 4) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("staff management")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 5) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("manage patient")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 6) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("archive patient")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 7) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("transaction log")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 8) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("patient document")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 9) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("staff document")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 10) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("audit log")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 11) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("login log")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        } else if (i == 12) {
                            Thread.sleep(2000);
                            String element = chromeDriver.findElementByXPath(link).getText().toLowerCase();
                            System.out.println(element.toLowerCase());

                            if (element.contains("cms content")) {
                                chromeDriver.findElement(By.xpath(link)).click();
                                System.out.println(element + " page is working");
                            } else {
                                System.out.println(element + " page is not working");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}