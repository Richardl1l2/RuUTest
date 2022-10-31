package co.com.choucair.runutest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target PASSWORD = Target.the("password").
            locatedBy(" //input[@name='password']");
    public static final Target CONPASSWORD = Target.the("conpassword").
            locatedBy(" //input[@name='confirmPassword']");

    public static final Target chekl1 = Target.the("check list 1").
            locatedBy(" //span[@class='checkmark signup-consent__checkbox error']");
    public static final Target chekl2 = Target.the("check list 2").
            locatedBy(" //span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BUTTONCOMPLETE = Target.the("registro completado").
            locatedBy(" //a[@class='btn btn-blue']");
}
