import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount {
    public void Myaccount (){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/magento-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.first > a")).click();
        driver.findElement(By.cssSelector("#login-form > div > div.col-1.new-users > div.buttons-set > a")).click();
                driver.findElement(By.cssSelector("#firstname")).sendKeys("Dolha");
                driver.findElement(By.cssSelector("#middlename")).sendKeys("Ralu");
                driver.findElement(By.cssSelector("#lastname")).sendKeys("Raluca");
                driver.findElement(By.cssSelector("#email_address")).sendKeys("ralucafalcusan@yahoo.com");
                driver.findElement(By.cssSelector("#password")).sendKeys("213123456");
                driver.findElement(By.cssSelector("#confirmation")).sendKeys("213123456");
                driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
                driver.close();

    }
}
