package tests.US_11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {

    TradylinnPage tlp = new TradylinnPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test02() throws InterruptedException {
        ReusableMethods.tradyGiris();
        Thread.sleep(4000);

        tlp.hesabimButon.click();
        tlp.storeManagerButon.click();
        tlp.urunButon.click();
        tlp.yeniEkleButon.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        tlp.topUrunGosAyarlari.click();

        tlp.unitsPerPieceBox.clear();
        tlp.unitsPerPieceBox.sendKeys("100");


        WebElement actualResult=tlp.unitsPerPieceBox;
        Assert.assertTrue(actualResult.isDisplayed());

          }
}
