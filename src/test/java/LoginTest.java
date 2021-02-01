import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
//    Adăugați în clasa LoginTest un test în care să automatizați pașii necesari pentru logarea cu succes a unui utilizator.

    public class Logintest {
        public void logintest() {
            WebDriver driver = new ChromeDriver();
            driver.get("http://testfasttrackit.info/magento-test/");
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
            driver.findElement(By.cssSelector("#email")).sendKeys("ralucafalcusan@yahoo.com");
            driver.findElement(By.cssSelector("#pass")).sendKeys("213123456Your");
            driver.findElement(By.cssSelector("#send2")).click();

//            În pachetul test, creați o clasă LoginTest în care veți adăuga teste referitoare la logarea utilizatorilor.





            }
        public void teste (){
            WebDriver driver = new ChromeDriver();
            driver.get("http://testfasttrackit.info/magento-test/");
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
            driver.findElement(By.id("#email")).sendKeys("1010209931010");
            driver.findElement(By.cssSelector("#pass")).sendKeys("           ");
            driver.findElement(By.cssSelector("#send2")).click();





}}
}