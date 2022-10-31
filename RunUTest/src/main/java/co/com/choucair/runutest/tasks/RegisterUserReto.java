package co.com.choucair.runutest.tasks;

import co.com.choucair.runutest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("pepe").into(Personal.FIRSTNAME),
                SendKeys.of("lopez").into(Personal.LASTNAME),
                SendKeys.of("perezlopez0101@hotmail.com").into(Personal.EMAIL),
                SendKeys.of("May").into(Personal.MONTH),
                SendKeys.of("22").into(Personal.DAY),
                SendKeys.of("2000").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SYSTEM),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LENGUAJE),
                Click.on(Devices.INGLES),
                Click.on(Devices.BOTTONLASTFINAL),
                SendKeys.of("Colombia2022***").into(Complete.PASSWORD),
                SendKeys.of("Colombia2022***").into(Complete.CONPASSWORD),
                Click.on(Complete.chekl1),
                Click.on(Complete.chekl2),
                Click.on(Complete.BUTTONCOMPLETE)

        );
    }
    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);
    }
}
