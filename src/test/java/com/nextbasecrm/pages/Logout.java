package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BasePage {

    public Logout(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//*[@id='user-block']")
    public WebElement userBlock;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    public WebElement logoutButton;

}
