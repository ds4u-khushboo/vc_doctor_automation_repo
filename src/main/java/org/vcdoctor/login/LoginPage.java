package org.vcdoctor.login;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginPage {

    ChromeDriver chromeDriver;

    @Test
    public void getLoginPage() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://vcclinic.ukitss.com/");
        chromeDriver.findElementByXPath("//*[@id=\"main-nav\"]/li[9]/a[1]").click();
        chromeDriver.findElementByXPath("//*[@id=\"btnPassword\"]").click();
//        String filePath = "E:\\Khushboo\\selenium-project\\Employee.xlsx";
        FileInputStream fileInputStream=new FileInputStream("E:\\Khushboo\\vc_doctor_automation\\data.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
     //   Sheet s=xssfWorkbook.getSheet("sheet 1");
        XSSFSheet xssfSheet= xssfWorkbook.getSheetAt(0);
        Row row=xssfSheet.getRow(1);
        String countryCode=row.getCell(0).getStringCellValue();
//        System.out.print
        String phone_no= row.getCell(1).getStringCellValue();
        String password = row.getCell(2).getStringCellValue();
        chromeDriver.findElementByXPath("//*[@id=\"select2-CountryCode-container\"]").sendKeys(countryCode);
        Thread.sleep(4000);
        chromeDriver.findElementByXPath("//*[@id=\"UserName\"]").sendKeys("744564635677");
        Thread.sleep(4000);
        chromeDriver.findElementByXPath("//*[@id=\"Password\"]").sendKeys("pass@123");
        Thread.sleep(4000);
        chromeDriver.findElementByXPath("//*[@id=\"LoginForm\"]/div[6]/button[1]").click();
        chromeDriver.close();



    }

}
