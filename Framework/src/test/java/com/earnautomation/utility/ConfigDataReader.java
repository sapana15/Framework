package com.earnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataReader {

	Properties pro;

	public ConfigDataReader() {

		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to load config file" + e.getMessage());
		}

	}

	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty("keyToSearch");

	}

	public String getBrowser() {
		return pro.getProperty("Browser");

	}

	public String getStagingURL() {
		return pro.getProperty("qaURL");

	}

}
