package com.banggood.automation.AppiumDriver.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BangGoodUI {

    public static final Target BTN_NEW_USER_BENEFICTS = Target.the("button that chooses the list of products with beneficts").locatedBy("//android.widget.ImageView[@resource-id='com.banggood.client:id/iv_product']");
    public static final Target BTN_SCREWERS = Target.the("button to choose the screwers").locatedBy("//android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[1]");
    public static final Target BTN_ADD_TO_CART_ONE = Target.the("the first add to cart button").locatedBy("//android.widget.Button[@resource-id='com.banggood.client:id/btn_slide_cart']");
    public static final Target BTN_ADD_TO_CART_FINAL = Target.the("the final button to add the product to the cart").locatedBy("//*[contains(@text,'Add to Cart')]");
    public static final Target TXT_SCREWERS_VALIDATION = Target.the("product screwers").locatedBy("//*[@text='7/12/18PCS Set Nail Clipper Set Durable Nail File Nose Trimmer Toenail Clipper Beauty Nail Manicure Pedicure Tool']");
    public static final Target BTN_CHECK_CART = Target.the("button to check the cart products").locatedBy("//*[@id='menu_cart_icon']");
    public static final Target BTN_GO_BACK = Target.the("arrow to go back").locatedBy("//android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
    public static final Target BTN_CATEGORIES = Target.the("button to select categories").locatedBy("//android.view.ViewGroup[@resource-id='com.banggood.client:id/main_tab_category']");
    public static final Target BTN_WATER_SPORTS = Target.the("button to select water sports category").locatedBy("//android.widget.ImageView[@resource-id='com.banggood.client:id/iv_category_logo']");
    public static final Target BTN_DIVING_FINS = Target.the("button to select the diving fins").locatedBy("//android.widget.ImageView[@resource-id='com.banggood.client:id/iv_product']");
    public static final Target BTN_ADD_CART_ONE = Target.the("button to add the cart first time").locatedBy("//android.widget.Button[@resource-id='com.banggood.client:id/btn_slide_cart']");
    public static final Target BTN_ADD_CART_FINAL = Target.the("button to select the diving fins").locatedBy("//*[contains(@text,'Add to Cart')]");
    public static final Target BTN_GO_BACK_ON_CATEGORY = Target.the("arrow to go back").locatedBy("//android.view.ViewGroup[@resource-id='com.banggood.client:id/tab_view']");


}
