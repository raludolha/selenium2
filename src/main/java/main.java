import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        Login login = new Login();
        login.login();

        MyAccount myaccount = new MyAccount();
        myaccount.Myaccount();

        Test test = new Test();
        test.test();


    }

    }


