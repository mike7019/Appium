package com.banggood.automation.AppiumDriver.tasks;

import com.banggood.automation.AppiumDriver.ui.BangGoodUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ClearTheCart implements Task {

    BangGoodUI bangGoodUI = new BangGoodUI();
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static ClearTheCart on(){
        return Instrumented.instanceOf(ClearTheCart.class).withProperties();
    }
}
