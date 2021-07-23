package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {

    public static final Target JOIN_BUTTON = Target.the("button that show the from to join up")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME = Target.the("Where do write his first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME =   Target.the("Where do write his last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Where do write his email")
            .located(By.id("email"));
    public static final Target DROP_MOMTH = Target.the("Where do select his birth month")
            .located(By.id("birthMonth"));
    public static final Target DROP_DAY = Target.the("Where do select his birth day")
            .located(By.id("birthDay"));
    public static final Target DROP_YEAR = Target.the("Where do select his birth year")
            .located(By.id("birthYear"));
    public static final Target SELECT_LANGUAGE = Target.the("Where do select his language")
            .located(By.xpath("//input[@type='search']"));
    public static final Target LOCATION_BUTTON = Target.the("Where do click to go the next form")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target POSTAL_CODE = Target.the("Where do write his postal code")
            .located(By.id("zip"));
    public static final Target DEVICE_BUTTON = Target.the("Where do click to go the next form")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target LAST_BUTTON = Target.the("Where do click to go the next form")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target PASSWORD = Target.the("Where do write his password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Where do write his password again")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_USE = Target.the("Where do accept the utest terms of use")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_POLICY = Target.the("Where do accept the privacy & security policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("Where do click for complete the form")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
