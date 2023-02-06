package org.vcdoctor.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class InitiateBrowser {

    public WebDriver webDriver;

    @BeforeMethod
    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://vcclinic.ukitss.com/");
    }
//    public void getOTP(){
    //Notification outboundNotification = new Notification();
//                Modem gateway = new SerialModemGateway("modem.com5", "COM5", 9600, "ZTE", "COM5");
//                gateway.setInbound(true);
//                gateway.setOutbound(true);
//                gateway.setSmscNumber("+91XXXXXXXXXX"); // 10-digit Mobile Number
//                Service.getInstance().setOutboundMessageNotification(outboundNotification);
//                Service.getInstance().addGateway(gateway);
//                Service.getInstance().startService();
//                OutboundMessage msg = new OutboundMessage(ExcelConnect.strSMSTo, ExcelConnect.strSMSText);
//                Service.getInstance().sendMessage(msg);
//        System.out.println(msg);
//        System.out.println(ExcelConnect.strSMSTo + "-" + ExcelConnect.strSMSText);
//        Service.getInstance().stopService();
//        Service.getInstance().removeGateway(gateway);
}
