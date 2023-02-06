package org.vcdoctor.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.vcdoctor.Configuration;

public class LoginPageTest extends InitiateBrowser {

    @Test(dataProvider = "loginExcel", dataProviderClass = Configuration.class)
    public void getLogin(String countrycode, String username, String password) throws InterruptedException {

        webDriver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[9]/a[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"btnPassword\"]")).click();

        webDriver.findElement(By.xpath("//*[@id=\"select2-CountryCode-container\"]")).sendKeys(countrycode);
        Thread.sleep(5000);
        webDriver.findElement(By.name("UserName")).sendKeys(username);
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);

//            FileInputStream fileInputStream = new FileInputStream("E:\\Khushboo\\vc_doctor_automation\\data.xlsx");
//            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//            Sheet sheet = workbook.getSheetAt(0);
//            int rowcount = 1;
//            for (Row row : sheet) {
//                List<Object> rowData = new ArrayList<>();
//                for (Cell cell : row) {
//                    rowData.add(cell.getStringCellValue());
//                    rowcount++;
//                }
        //*[@id="select2-CountryCode-container"]
//                Select dropdown = new Select(webDriver.findElement(By.xpath("*[@id=\"select2-CountryCode-container\"]")));
//                Thread.sleep(3000);
//                dropdown.selectByVisibleText("(+213) Algeria");

////                String username = row.getCell(1).getStringCellValue();

//                Thread.sleep(5000);
////                String password = row.getCell(2).getStringCellValue();

//                Thread.sleep(10000);
//                webDriver.findElement(By.xpath(("//*[@id=\"LoginForm\"]/div[6]/button[1]").click();
//                Thread.sleep(5000);
//                for (int i = 1; i <= 12; i++) {
//                    String link = "/html/body/div[1]/main/div/div[1]/aside/ul/li[" + i + "]/div/a";
//                    String heading = "/html/body/div[1]/main/div/div[2]/div[2]/div[1]/h4";
//                    System.out.println(link);
//                    try {
//                        if (i == 1) {
//                            String dashboardLink = "/html/body/div[1]/main/div/div[2]/div[2]/div/div/div[1]";
//                            webDriver.findElement(By.xpath(dashboardLink)).click();
//                            Thread.sleep(5000);
//                            String element = webDriver.findElement(By.xpath((heading).getText();
//                            System.out.println(element);
//                            if (element.toLowerCase() == "Welcome To ORGANIZATION ADMIN DASHBOARD".toLowerCase()) {
//                                System.out.println("page is working");
//                            } else {
//                                System.out.println("page is not working");
//                            }
//                            Thread.sleep(1000);
//                        } else if (i == 2) {
//                            Thread.sleep(5000);
//                            String element = webDriver.findElement(By.xpath((link).getText();
//                            System.out.println(element);
//
//                            if (element.contains("Manage Info")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println("page is working");
//                            } else {
//                                System.out.println("page is not working");
//                            }
//
//                        } else if (i == 3) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText();
//                            System.out.println(element);
//
//                            if (element.contains("Manage Locations")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println("page is working");
//                            } else {
//                                System.out.println("page is not working");
//                            }
//                        } else if (i == 4) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("staff management")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 5) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("manage patient")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 6) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("archive patient")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 7) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("transaction log")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 8) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("patient document")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 9) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("staff document")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 10) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("audit log")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 11) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("enterPassword log")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }
//                        } else if (i == 12) {
//                            Thread.sleep(2000);
//                            String element = webDriver.findElement(By.xpath((link).getText().toLowerCase();
//                            System.out.println(element.toLowerCase());
//
//                            if (element.contains("cms content")) {
//                                webDriver.findElement(By.xpath(link)).click();
//                                System.out.println(element + " page is working");
//                            } else {
//                                System.out.println(element + " page is not working");
//                            }

    }
}
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

