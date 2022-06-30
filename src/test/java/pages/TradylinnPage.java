package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TradylinnPage {
    public TradylinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath ="//a[@class='login inline-type']")
    public WebElement gitGirisYap;

    @FindBy (xpath = "(//a[@href='signup'])[1]")
    public WebElement uyeOL;

    @FindBy (xpath = "(//a[@class='nav-link'])[1]")
    public WebElement girisYap;

    @FindBy (xpath = "//a[@href='https://tradylinn.com/vendor-register/']")
    public WebElement saticiOl;

    @FindBy (xpath = "//h2[text()='Vendor Registration']")
    public WebElement vendorRegistration;

    @FindBy (xpath = "//input[@name='user_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@name='passoword']")
    public WebElement passwordBox;

    @FindBy (xpath = "//input[@name='confirm_pwd']")
    public WebElement confirmBox;

    @FindBy (xpath = "//input[@name='save-data']")
    public WebElement register;

    @FindBy (xpath = "(//input[@name='username'])[1]")
    public WebElement girisEmail;

    @FindBy (xpath = "(//input[@name='password'])[1]")
    public WebElement girisPassword;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement girisEnter;

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

    @FindBy(xpath = "//tr[@class='woocommerce-orders-table__row woocommerce-orders-table__row--status-processing order']")
    public List<WebElement> siparisler;

    @FindBy(xpath = "(//*[text()='Siparişler'])[1]")
    public WebElement siparisButon;

    @FindBy(xpath = "//td[@class='download-product']")
    public List<WebElement> indirmeler;

    @FindBy(xpath=("//*[text()='İndirmeler']"))
    public WebElement indirmelerButon;

    @FindBy(xpath=("//*[text()='Adres']"))
    public WebElement adresButon;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[1]/div")
    public List<WebElement> faturaAdresi;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[2]/div")
    public List<WebElement> gonderimAdresi;

    @FindBy(xpath=("//a[text()='Hesap detayları']"))
    public WebElement hesapDetaylariButon;

    @FindBy(xpath ="//input[@id='account_first_name']")
    public WebElement hesapDetaylariAd;

    @FindBy(xpath ="//input[@id='account_last_name']")
    public WebElement hesapDetaylariSoyad;

    @FindBy(xpath ="//input[@id='account_display_name']")
    public WebElement hesapDetaylariGorunenAd;

    @FindBy(xpath ="//input[@id='account_email']")
    public WebElement hesapDetaylariEmail;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement degisiklileriKaydetButonu;

    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement basariylaKaydedildiYazisi;










}



