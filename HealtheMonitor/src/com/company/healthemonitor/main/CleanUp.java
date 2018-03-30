/**
 * 
 */
package com.company.healthemonitor.main;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * @author TK048537
 *
 */
public class CleanUp {

	/**
	 * @param args
	 */
	private File file;
	static Logger logger = Logger.getLogger(CleanUp.class);

	CleanUp(File file) {
		this.file = file;
		}

	protected boolean cleaner() {
		boolean flag = false;
		File[] Filelist = file.listFiles();
		for (int i = 0; i < Filelist.length; i++) {
			if (Filelist[i].getName().endsWith(".sh") || (Filelist[i].getName().endsWith(".bat"))) {
				logger.info("Deleting " + Filelist[i].getName());
				Filelist[i].delete();
				flag = true;
			}

		}
		return flag;
	}
	

}
