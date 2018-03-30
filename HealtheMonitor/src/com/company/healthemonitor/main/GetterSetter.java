/**
 * 
 */
package com.company.healthemonitor.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author TK048537
 *
 */
public class GetterSetter {
private String path;
private InputStream file;
private Properties propObj = new Properties();
private String propFileName = "Configuration.properties";
static Logger logger = Logger.getLogger(GetterSetter.class);

/**
 * @return the path
 * @throws FileNotFoundException 
 */
public String getPath(String folderName) throws FileNotFoundException {
	
	file = getClass().getClassLoader().getResourceAsStream(propFileName);

		if (file != null) {
			try {
				propObj.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.warn(e.getMessage());
				e.printStackTrace();
				
			}
		} else {
			try {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
		}

		path = propObj.getProperty(folderName);
	
	
	return path;
}

/**
 * @param path the path to set
 */
public void setPath(String path) {
	this.path = path;
}


}
