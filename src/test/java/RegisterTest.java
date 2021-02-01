import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    //    În pachetul test, creați o clasă RegisterTest în care veți adăuga teste referitoare la înregistrarea utilizatorilor noi.
    public void register() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/magento-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector(" driver.findElement(By.cssSelector(\"#header-account > div > ul > li:nth-child(5) > a\")).click();")).sendKeys("Ana");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Pop");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("anapop@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();


    }

    //    Adăugați în clasa RegisterTest un test(o noua metoda) în care să automatizați pașii necesari
//    pentru înregistrarea cu succes a unui utilizator nou (deschideți homepage-ul, apăsați pe Account, apăsați pe Register,
//    completați toate câmpurile de pe pagina Register - atenție ca email-ul să fie unic, bifați opțiunea pentru primirea newsleterr-ului).
//    Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className). Pe viitor, după învățarea altor identificatori,
//    veți reveni pentru a apăsa și butonul Register. Apelati metoda aceasta in metoda main din clasa pentru a rula testul.
    public void succes() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/magento-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.name("#firstname")).sendKeys("Dolha");
        driver.findElement(By.name("#lastname")).sendKeys("Ralu");
        driver.findElement(By.id("#email_address")).sendKeys("ralucafalcusan@yahoo.com");
        driver.findElement(By.className("#password")).sendKeys("213123456Your");
        driver.findElement(By.className("#confirmation")).sendKeys("213123456Your");
        driver.findElement(By.cssSelector("#is_subscribed")).click();


    }
}