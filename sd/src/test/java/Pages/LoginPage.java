package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 11/12/2016.
 */
public class LoginPage extends BasePage {
    @FindBy(id = "mailbox__login")
    public WebElement loginName;

	@FindBy(id="mailbox__password")
	private WebElement loginPassword;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;


	public LoginPage(WebDriver driver) {
		super(driver);
	}

public 	AfterLoginPage login(String name, String password) throws InterruptedException {
		loginName.sendKeys(name);
		loginPassword.sendKeys(password);
		authButton.click();
        return new AfterLoginPage(driver);
	}
}
