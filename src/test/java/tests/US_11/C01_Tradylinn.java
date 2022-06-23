package tests.US_11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_Tradylinn {

TradylinnPage tlp=new TradylinnPage();
Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        tlp.hesabimButon.click();
        tlp.eMailBox.sendKeys(ConfigReader.getProperty("hesabimEmail"));
        tlp.sifreBox.sendKeys(ConfigReader.getProperty("hesabimSifre"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        tlp.girisYapButon.click();


        tlp.storeManagerButon.click();
        tlp.urunButon.click();
        tlp.yeniEkleButon.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        tlp.topUrunGosAyarlari.click();
        Select select=new Select(tlp.pieceTypeBox);



    }

}
