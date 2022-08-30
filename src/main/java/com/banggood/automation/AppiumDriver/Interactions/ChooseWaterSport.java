package com.banggood.automation.AppiumDriver.Interactions;

import com.banggood.automation.AppiumDriver.ui.BangGoodUI;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class ChooseWaterSport implements Task {

    BangGoodUI bangGoodUI = new BangGoodUI();
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> categoryList = bangGoodUI.BTN_WATER_SPORTS.resolveAllFor(actor);
        int index = 17;
        categoryList.get(index).click();
        HoldOnFor.thisSeconds(3);

    }

    public static ChooseWaterSport on() {
        return Instrumented.instanceOf(ChooseWaterSport.class).withProperties();
    }
}
