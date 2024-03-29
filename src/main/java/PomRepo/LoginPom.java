package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement txt_email;

@FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement txt_pass;

@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement btn_login; 

public WebElement getTxt_email() {
	return txt_email;
}




public WebElement getTxt_pass() {
	return txt_pass;
}

 

public WebElement getBtn_login() {
	return btn_login;
}

 
}
