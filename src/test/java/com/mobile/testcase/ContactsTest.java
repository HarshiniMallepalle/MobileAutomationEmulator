package com.mobile.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobile.base.BaseTest;
import com.mobile.pages.ContactsPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ContactsTest extends BaseTest {

	AndroidDriver<MobileElement> driver;
	ContactsPage contact;
	
	@BeforeMethod
	public void beforeMethod(){
		driver=launchMobileApp();
		contact =new ContactsPage(driver);
	}

	@Test
	public void MyContacts() {
		contact.pressSearch();
	    //contact.pressOptions();
	
	}

	@AfterMethod
	public void tearDown() {
       driver.quit();
	}

}
