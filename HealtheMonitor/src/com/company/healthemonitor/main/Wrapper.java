/**
 * 
 */
package com.company.healthemonitor.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * @author TK048537
 *
 */
public class Wrapper {

	static Logger logger = Logger.getLogger(Wrapper.class);
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Initialize
		Initialize intObj = new Initialize();
				
		//Delete the .sh and .bat file
		CleanUp cleanUpObj = new CleanUp(intObj.getSourceFile());
		boolean flag = cleanUpObj.cleaner();
		if (flag == true)
		{
			logger.info("Deleted .bat/.sh files");
		}
		else
		{
			logger.info("No .bat/.sh files found");
		}
		//Check the size
		Checker checkObj = new Checker(intObj.getSourceFile(),intObj.getArchiveFile());
		
		
	}

}
