package com.banggood.automation.AppiumDriver.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchByBar implements Task {
    public static SearchByBar on(){
        return Instrumented.instanceOf(SearchByBar.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
          /*      Click.on(BTN_SEARCH_BAR),
                Enter.theValue("scuba").into(BTN_SEARCH_BAR),
                Click.on(BTN_NEOPRENE),
                Click.on(BTN_ADD_TO_CART)*/
        );
    }
}
