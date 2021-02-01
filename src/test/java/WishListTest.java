import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    public void wishlist(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/magento-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("<a href=\"http://testfasttrackit.info/magento-test/customer/account/login/\" title=\"Log In\">Log In</a>")).click();
        driver.findElement(By.cssSelector("<input type=\"email\" autocapitalize=\"off\" autocorrect=\"off\" spellcheck=\"false\" name=\"login[username]\" value=\"\" id=\"email\" class=\"input-text required-entry validate-email\" title=\"Email Address\">")).sendKeys("dolhaangel@gmail.com");
        driver.findElement(By.cssSelector("<input type=\"password\" name=\"login[password]\" class=\"input-text required-entry validate-password\" id=\"pass\" title=\"Password\">")).sendKeys("Ioanoarga8");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-3.active.parent > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-3.active.parent > ul > li.level1.nav-3-2.active > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button > span > span")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button > span > span")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.close();
    }
}
