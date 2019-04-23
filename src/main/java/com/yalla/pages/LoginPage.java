package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class LoginPage extends Annotations{ 
	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="username")  WebElement eleUserName;
	@FindBy(how=How.ID, using="password")  WebElement elePassWord;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("id", "username");
		clearAndType(eleUserName, data);  
		return this; 
	}
	
	public LoginPage enterPassWord(String data) {
		//WebElement elePassWord = locateElement("id", "password");
		clearAndType(elePassWord, data); 
		return this; 
	}
	
	public HomePage clickLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
          click(eleLogin);  
          return new HomePage();
	}
	
}







