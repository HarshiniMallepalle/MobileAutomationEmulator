package com.mobile.pages;

import com.mobile.base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContactsPage extends BasePage{

	public ContactsPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
@AndroidFindBy(id="com.android.dialer:id/search_box_start_search")
MobileElement search;
	
@AndroidFindBy(id="com.android.dialer:id/main_options_menu_button")
MobileElement Options;


	
public void pressSearch() {
	search.click();
}


public void pressOptions() {
	Options.click();
}
	
	
	
}
