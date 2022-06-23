package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement hesabimButon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifreBox;

    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement girisYapButon;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManagerButon;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement urunButon;

    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement yeniEkleButon;

    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head']")
    public WebElement topUrunGosAyarlari;

    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement pieceTypeBox;

    @FindBy(xpath = "//input[@id='unitpercart']")
    public WebElement unitsPerPieceBox;

    @FindBy(xpath = "//input[@id='minorderqtytr']")
    public WebElement minOrderQuantyBox;


}
