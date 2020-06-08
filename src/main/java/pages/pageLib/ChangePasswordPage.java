package pages.pageLib;

import com.codeborne.selenide.SelenideElement;

import pages.PageManager;

public class ChangePasswordPage extends BasePage {


  //Constructor
  public ChangePasswordPage() {
    addElement("title", "//h1[contains(., 'Change Password')]");
    addElement("currentPasswordField", "input[id='currentPassword'][type='password']");
    addElement("newPasswordField", "input[id='newPassword'][type='password']");
    addElement("repeatNewPasswordField", "input[id='newPasswordRepeat'][type='password']");
    addElement("change", "button[id='changeButton']");
    addElement("accountButton", "button[aria-label='Show/hide account menu']");
    addElement("logout", "button[id='navbarLogoutButton']");
    addElement("accountButton", "button[aria-label='Show/hide account menu']");
    addElement("loginButton", "button[aria-label*='Go to login page");
  }

  public void navigate(String element) {
    switch (element){
      case "loginButton": PageManager.setCurrentPage(PageManager.getLoginPage());
    }
  }

  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }
}
