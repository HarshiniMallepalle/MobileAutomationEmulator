package com.mobile.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	private static AndroidDriver<MobileElement> driver;
	
	public AndroidDriver<MobileElement> launchMobileApp(){
		
	DesiredCapabilities capabalities = new DesiredCapabilities();
	
	//File appDir = new File("");
	//File newApp =new File(appDir,"");
		
	capabalities.setCapability("deviceName", "emulator-5554");
	capabalities.setCapability("platformName", "Android");
	capabalities.setCapability("platformVersion", "11.0");
	capabalities.setCapability("appPackage", "com.android.dialer");
	capabalities.setCapability("appActivity", "com.android.dialer.main.impl.MainActivity");
	//capabalities.setCapability("app",newApp.getAbsolutePath());

	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabalities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return driver;
		
	}
	
	

}
