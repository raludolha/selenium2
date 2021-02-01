import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/magento-test/");
        WishListTest wishlist = new WishListTest();
        wishlist.wishlist();
        driver.close();
        RegisterTest register = new RegisterTest();
        register.register();
        driver.close();
        RegisterTest succes = new RegisterTest();
        succes.succes();


}
}
