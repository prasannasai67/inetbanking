package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String URL = prop.getProperty("baseURL");
		return URL;
	}

	public String getUsername() {
		String Username=prop.getProperty("username");
		return Username;
				
	}
	public String getPassword() {
		String Password=prop.getProperty("password");
		return Password;
				
	}
	public String getChromePath() {
		String ChromePath=prop.getProperty("Chromepath");
		return ChromePath;
				
	}
	public String getFirefoxPath() {
		String Firefoxpath=prop.getProperty("Firefoxpath");
		return Firefoxpath;
				
	}
	public String getIEPath() {
		String IEPath=prop.getProperty("IEpath");
		return IEPath;
				
	}
	public String getAccoutnumber() {
		String AccountNumber=prop.getProperty("acctno");
		return AccountNumber;
	}
	public String getAmount() {
		String Amount=prop.getProperty("ammount");
		return Amount;		
	}
	public String getDescription() {
		String Description=prop.getProperty("descp");
		return Description;	
	}
	
	

}
