package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By user_name = By.id("user-name");
    private By pass= By.id("password");
    private By submit =By.id("login-button");
    public  Login(WebDriver driver){
        this.driver=driver;

    }
    public WebDriver valid_login(String username , String password) {
        driver.findElement(user_name).sendKeys(username);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(submit).click();
        return driver;

    }
    public void assert_login() {

    }

}
