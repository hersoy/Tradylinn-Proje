package tests.US_12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {

    @Test
    public void test03() throws InterruptedException {
        TradylinnPage tlp = new TradylinnPage();
        extentTest=extentReports.createTest("TradylinnSayfasi",
                "Vendor olarak Hesap Detaylarini goruntuleyebilmeli ve update edebilmeli");
        ReusableMethods.tradyGiris();
        Thread.sleep(7000);
        extentTest.info("dogru kullanici adi ve sifre ile sayfaya girildi");

        tlp.hesabimButon.click();
        Thread.sleep(5000);
        extentTest.info("Hesabim butonuna tiklandi");
        tlp.hesapDetaylariButon.click();
        extentTest.info("Hesap Detaylari butonuna tiklandi");

        Assert.assertTrue(tlp.hesapDetaylariAd.isDisplayed());
        extentTest.pass("Ad'in gorunur oldugu dogrulandi");
        Assert.assertTrue(tlp.hesapDetaylariSoyad.isDisplayed());
        extentTest.pass("Soyad'in gorunur oldugu dogrulandi");
        Assert.assertTrue(tlp.hesapDetaylariGorunenAd.isDisplayed());
        extentTest.pass("GorunenAd'in gorunur oldugu dogrulandi");
        Assert.assertTrue(tlp.hesapDetaylariEmail.isDisplayed());
        extentTest.pass("Email'in gorunur oldugu dogrulandi");

        tlp.hesapDetaylariAd.clear();
        tlp.hesapDetaylariAd.sendKeys("Hamza");
        extentTest.info("Yeni isim girildi");
        tlp.hesapDetaylariSoyad.clear();
        tlp.hesapDetaylariSoyad.sendKeys("Ersoy");
        Thread.sleep(3000);
        extentTest.info("Yeni soyisim girildi");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        tlp.degisiklileriKaydetButonu.click();
        extentTest.info("Degisiklikleri kaydet butonuna tiklandi");

        String kaydedildiYazisi=tlp.basariylaKaydedildiYazisi.getText();
        System.out.println(kaydedildiYazisi);
        Assert.assertTrue(tlp.basariylaKaydedildiYazisi.isDisplayed());
        extentTest.pass("Degisikliklerin basariyla kaydedildigi dogrulandi");






    }
}
