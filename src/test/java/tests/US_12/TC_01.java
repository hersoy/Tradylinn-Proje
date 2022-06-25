package tests.US_12;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_01 {

    @Test
    public void test01() throws InterruptedException {
        TradylinnPage tlp = new TradylinnPage();

        ReusableMethods.tradyGiris();
        Thread.sleep(3000);

        tlp.hesabimButon.click();
        tlp.siparisButon.click();
        List<String> siparisList=new ArrayList<>();

        for (WebElement each:tlp.siparisler
             ) {
            siparisList.add(each.getText());
        }
        System.out.println("siparisList = " + siparisList);
    }
}
