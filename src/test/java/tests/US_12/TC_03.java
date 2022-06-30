package tests.US_12;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_03 {

    @Test
    public void test03() throws InterruptedException {
        TradylinnPage tlp = new TradylinnPage();

        ReusableMethods.tradyGiris();
        Thread.sleep(7000);

        tlp.hesabimButon.click();
        Thread.sleep(5000);
        tlp.adresButon.click();


        List<String> faturaAdresiList = new ArrayList<>();
        for (WebElement each : tlp.faturaAdresi
        ) {
            faturaAdresiList.add(each.getText());
        }
        System.out.println("Fatura Adresi : " + faturaAdresiList);

        System.out.println("==========================================================================================");

        List<String> gondrimAdresiList = new ArrayList<>();
        for (WebElement each : tlp.gonderimAdresi
        ) {
            gondrimAdresiList.add(each.getText());
        }
        System.out.println("Gönderim Adresi : " + gondrimAdresiList);

        Assert.assertTrue(!tlp.faturaAdresi.isEmpty());
        Assert.assertTrue(!tlp.gonderimAdresi.isEmpty());
    }
}