package com.company.healthemonitor.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Initialize {
	/**
	 * @param args
	 */
	private File sourceFile;
	private File archiveFile;
	InputStream file;
	Properties propObj = new Properties();
	private GetterSetter getSetObj = new GetterSetter();

	/**
	 * @throws IOException 
	 * @constructor
	 */
	public Initialize() throws IOException {
		// TODO Auto-generated method stub
		setSourceFile();
		setArchiveFile();	
		Logger logger = Logger.getLogger(Initialize.class);
	}

	/**
	 * @return the archiveFile
	 */
	public File getArchiveFile() {
		return archiveFile;
	}

	/**
	 * @param archiveFile
	 *            the archiveFile to set
	 * @throws FileNotFoundException
	 */
	public void setArchiveFile() throws FileNotFoundException {
		this.archiveFile = new File(getSetObj.getPath("ARCHIVEFOLDER"));
	}

	/**
	 * @return the sourceFile
	 */
	public File getSourceFile() {
		return sourceFile;
	}

	/**
	 * @param file
	 *            the file to set
	 * @throws FileNotFoundException
	 */
	public void setSourceFile() throws FileNotFoundException {
		this.sourceFile = new File(getSetObj.getPath("SOURCEFOLDER"));
	}

}
