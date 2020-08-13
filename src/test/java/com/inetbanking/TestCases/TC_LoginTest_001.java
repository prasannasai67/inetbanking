package com.inetbanking.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void LoginTest() throws IOException {
		driver.get(baseURL);
		
		logger.info("url opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Entered username");
		lp.setPassWord(password);
		logger.info("Entered PASSWORD");
		lp.clicksubmit();
		String title = driver.getTitle();
		System.out.println(title);
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("TESTCASE PASSED");

		} else {
			captureScreen(driver,"LoginTest" );
			Assert.assertTrue(false);
			logger.info("TESTCASE FAILED");
		}

	}
}
