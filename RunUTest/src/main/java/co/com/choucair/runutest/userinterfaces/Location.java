package co.com.choucair.runutest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {
    public static final Target BUTTONLOCATION = Target.the("button location").
            locatedBy("//a[@class='btn btn-blue pull-right']");

}
