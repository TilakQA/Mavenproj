package com.herokuapp.parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Author = Tilak Gunisetti
This class is the parent of all the classes which inherit. 
This has the main file reading and all the common methods that are needed
*/

public class ParentClass {
	String configfilepath="F:\\Selenium-Workspace\\MavennPOMnTestNG\\src\\main\\java\\com\\herokuapp\\userconfiguration\\userconfiguration.properties";
	String value;
	
	public File configfile = new File(configfilepath);
	public Properties properties = new Properties();
	
	
	public String readValueofKey(String key) {
		try {
			FileInputStream fis = new FileInputStream(configfile);
			properties.load(fis);
			fis.close();
			value=properties.getProperty(key);	
		} catch (IOException e) {
			e.getMessage();
		}
		return value;
	}

}

