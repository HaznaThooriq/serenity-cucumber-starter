package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/ServiceLogin/identifier?hl=in&lp=1&flowName=GlifWebSignIn&flowEntry=AddSession")
public class DuckDuckGoHomePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/content/span")
    private WebElementFacade tmblBerikutnyaLogin;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/content/span")
    private WebElementFacade tmblBerikutnyaPassword;


    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElementFacade fieldUsernameGoogle;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElementFacade fieldPasswordGoogle;

    public void typeUsername(){
        typeInto(fieldUsernameGoogle,"cahaya.petshop2");
        tmblBerikutnyaLogin.click();
    }

    public void typePassword(){
        typeInto(fieldPasswordGoogle,"CahayaPetshop99");
        tmblBerikutnyaPassword.click();
    }

}
