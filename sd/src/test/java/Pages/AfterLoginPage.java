package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 11/12/2016.
 */
public class AfterLoginPage  extends BasePage{
	@FindBy(id="PH_user-email")
	private WebElement userEmail;

	@FindBy(xpath=".//*[@id='b3a6b3e38-34f5-6188-46c8-eb11ff6a349']/div/div/div[2]/div/a")
	private WebElement writeEmail;

	@FindBy(id="toolkit-147902415746137composeForm")
	private WebElement who;

	@FindBy(id="toolkit-147902415746137composeForm")
	private WebElement topic;

	@FindBy(id="id='tinymce'")
	private WebElement textField;
	@FindBy(id="c321d3d25-58cc-4fb2-d38f-93fedf565d1")
	private WebElement sendButton;



	public AfterLoginPage(WebDriver driver) {
		super(driver);
	}

	public String userEmailText() {
		return userEmail.getText();
	}

	public AfterLoginPage sendEmail(){
		writeEmail.click();
		who.sendKeys("adler.kh@gmail.com");
		topic.sendKeys("Hello");
		textField.sendKeys("Body of the mail");

		return new AfterLoginPage(driver);


	}
}
