//package org.vcdoctor.enterPassword;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.junit.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SignUpPage extends InitiateBrowser {
//
//
//    @Test
//    public void getSignUpPage() throws FileNotFoundException, IOException {
//        try {
//
//            webDriver.findElement(By.xpath(("//*[@id=\"btnShowModel\"]").click();
//            Thread.sleep(5000);
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
////            WebDriverWait wait = new WebDriverWait(webDriver, 10);
////            wait.until(ExpectedConditions.alertIsPresent());
////            Alert alert = webDriver.switchTo().alert();
////            System.out.println(alert.getText());
////            alert.accept();
////
////            String patient="//*[@id=\"normalModal\"]/div/div/div[2]/div[2]/div[1]";
////            if (alert.getText().contains("Patient")) {
//                webDriver.findElement(By.xpath(("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/a/p").click();
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"select2-CountryCode-container\"]").click();
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"PhoneNumber\"]").sendKeys("9521052782");
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"btnGetOTP\"]").click();
//                Thread.sleep(5000);
//                Alert alerts = webDriver.switchTo().alert();
//                String alertText = alerts.getText();
//                System.out.println(alertText);
//                Thread.sleep(1000);
//                alerts.accept();
//                String elementOTP="//*[@id=\"OTP\"]";
//                webDriver.findElement(By.xpath((elementOTP).sendKeys("999999");
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"btnVerifyOTP\"]").click();
//                Alert alert = webDriver.switchTo().alert();
//                String alertOTP = alert.getText();
//                System.out.println(alertOTP);
//                Thread.sleep(1000);
//                alert.accept();
//                WebElement radioButton = webDriver.findElement(By.xpath("//input[@id='PresenterType' and @value='Yes']"));
//                Thread.sleep(4000);
//                radioButton.click();
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"FirstName\"]").sendKeys("john");
//                Thread.sleep(1000);
//                webDriver.findElement(By.xpath(("//*[@id=\"LastName\"]").sendKeys("samie");
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"Password\"]").sendKeys("Pass@123");
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"ConfirmPassword\"]").sendKeys("Pass@123");
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"Country\"]").sendKeys("India");
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"State\"]").sendKeys("Rajasthan");
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"CityName\"]").sendKeys("jaipur");
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"ReferenceType\"]").click();
//                Thread.sleep(2000);
//                webDriver.findElement(By.xpath(("//*[@id=\"ZipCode\"]").sendKeys("302020");
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"Email\"]").sendKeys("vcdemo@123.com");
//                Thread.sleep(5000);
//                webDriver.findElement(By.xpath(("//*[@id=\"TimeZone\"]").click();
//                Thread.sleep(3000);
////                webDriver.findElement(By.xpath(("//*[@id=\"LastName\"]").sendKeys("lastname");
////                Thread.sleep(4000);
////                webDriver.findElement(By.xpath(("//*[@id=\"Password\"]").sendKeys("pass@123");
////                Thread.sleep(4000);
////                webDriver.findElement(By.xpath(("//*[@id=\"ConfirmPassword\"]").sendKeys("pass@123");
////                Thread.sleep(4000);
////                webDriver.findElement(By.xpath(("//*[@id=\"State\"]").sendKeys("rajasthan");
////                Thread.sleep(4000);
//////                webDriver.findElement(By.xpath("xpath_otp_field")).sendKeys(user);
////                webDriver.findElement(By.xpath(("//*[@id=\"btnGetOTP\"]").click();
////                webDriver.findElement(By.xpath("xpath_mobile_field")).sendKeys("9521052782");
////                Scanner scuser = new Scanner(System.in);
////                System.out.println("Enter the OTP: ");
////                String user = scuser.nextLine();
////                webDriver.findElement(By.xpath("xpath_otp_field")).sendKeys(user);
//            }
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
//    }
//}