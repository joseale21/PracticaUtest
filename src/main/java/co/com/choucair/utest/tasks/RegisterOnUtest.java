package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterOnUtest implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strLanguage;
    private String strPostalCode;
    private String strPassword;
    private String strConfirmPassword;

    public RegisterOnUtest(
            String strFirstName, String strLastName,
            String strEmail, String strBirthMonth,
            String strBirthDay, String strBirthYear,
            String strLanguage, String strPostalCode,
            String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strLanguage = strLanguage;
        this.strPostalCode = strPostalCode;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    public static RegisterOnUtest onThePage(String strFirstName, String strLastName,
                                            String strEmail, String strBirthMonth,
                                            String strBirthDay, String strBirthYear,
                                            String strLanguage, String strPostalCode,
                                            String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(RegisterOnUtest.class,
                strFirstName, strLastName,
                strEmail, strBirthMonth,
                strBirthDay, strBirthYear, strLanguage, strPostalCode,
                strPassword, strConfirmPassword
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.EMAIL),
                SelectFromOptions.byValue(strBirthMonth).from(UtestRegisterPage.DROP_MOMTH),
                SelectFromOptions.byValue(strBirthDay).from(UtestRegisterPage.DROP_DAY),
                SelectFromOptions.byValue(strBirthYear).from(UtestRegisterPage.DROP_YEAR),
                Enter.theValue(strLanguage).into(UtestRegisterPage.SELECT_LANGUAGE),
                Click.on(UtestRegisterPage.LOCATION_BUTTON),
                Enter.theValue(strPostalCode).into(UtestRegisterPage.POSTAL_CODE),
                Click.on(UtestRegisterPage.DEVICE_BUTTON),
                Click.on(UtestRegisterPage.LAST_BUTTON),
                Enter.theValue(strPassword).into(UtestRegisterPage.PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestRegisterPage.CONFIRM_PASSWORD),
                Click.on(UtestRegisterPage.TERMS_USE),
                Click.on(UtestRegisterPage.PRIVACY_POLICY),
                Click.on(UtestRegisterPage.COMPLETE_BUTTON)

        );
    }
}
