package tests.US_12;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;


public class TC_02 {


    @Test
    public void test01() throws InterruptedException {
        TradylinnPage tlp = new TradylinnPage();

        ReusableMethods.tradyGiris();
        Thread.sleep(3000);

        tlp.hesabimButon.click();
        Thread.sleep(5000);
        tlp.indirmelerButon.click();

        List<String> indirmelerList = new ArrayList<>();
        for (WebElement each : tlp.indirmeler
        ) {
            indirmelerList.add(each.getText());
        }
        System.out.println("indirmelerList = " + indirmelerList);

        Assert.assertTrue(!tlp.indirmeler.isEmpty());




    }
}