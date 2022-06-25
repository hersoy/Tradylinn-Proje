package tests.US_11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    TradylinnPage tlp = new TradylinnPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
        ReusableMethods.tradyGiris();
        Thread.sleep(3000);

        tlp.hesabimButon.click();
        tlp.storeManagerButon.click();
        tlp.urunButon.click();
        tlp.yeniEkleButon.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        tlp.topUrunGosAyarlari.click();
        Select select = new Select(tlp.pieceTypeBox);
        select.selectByVisibleText("Piece");

        String actualSelect=select.getFirstSelectedOption().getText();
        String expectexSelect="Piece";
        Assert.assertEquals(expectexSelect,actualSelect);

        // WebElement actualSelect=select.getFirstSelectedOption();
        // Assert.assertTrue(actualSelect.isDisplayed());
    }
}
