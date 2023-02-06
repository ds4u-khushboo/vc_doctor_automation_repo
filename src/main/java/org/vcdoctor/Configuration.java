package org.vcdoctor;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class Configuration {


    @DataProvider(name = "loginExcel")
    public Object[][] dataGenerate() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("./data.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet loginSheet = xssfWorkbook.getSheet("login");
        int noOfRow = loginSheet.getPhysicalNumberOfRows();
        Object[][] testData = new Object[noOfRow][3];
        for (int i = 0; i < noOfRow; i++) {
            XSSFRow xssfRow = loginSheet.getRow(i);
            XSSFCell countryCode=xssfRow.getCell(0);
            XSSFCell phoneNumber = xssfRow.getCell(1);
            XSSFCell password = xssfRow.getCell(2);

            testData[i][0] = countryCode.getStringCellValue();
            testData[i][1] = phoneNumber.getStringCellValue();
            testData[i][2] = password.getStringCellValue();
        }
        return testData;
    }
}
