/**
 * 
 */
package com.company.healthemonitor.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.log4j.Logger;

/**
 * @author TK048537
 *
 */
public class Checker {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	private static File sourcePath;
	private static File archivePath;

	static int dupFiles = 0;
	static Logger logger = Logger.getLogger(Checker.class);
	Checker(File sourceFolder, File archiveFolder)
	{
		this.sourcePath = sourceFolder;
		this.archivePath = archiveFolder;
		try {
			healtheMonitor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.warn(e.getMessage());
		}
	}
	private void healtheMonitor() throws IOException {
		// TODO Auto-generated method stub
		
		
		
		 File[] Filelist = sourcePath.listFiles();
		 
		 Arrays.sort(Filelist, new Comparator<File>(){
		   public int compare(File f1, File f2) {
		     return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
		   } 
		 });
		  long folderSize = 0;
		  for(File file: Filelist) {
		    	 if(folderSize > 100000000)
		    	 {
		    		 move(file);
    		 			
		    	 }
		    	 else
		    	 {	
		    		 	folderSize = folderSize + file.length();   
		    		 	if (folderSize > 100000000)
		    		 	{
		    		 		move(file);
		    		 	}
		         }
		     }
		  if(dupFiles > 0)
			{
	        	logger.info(dupFiles+ " duplicate files found and replaced.");
			}
	}
	
	private void move(File file) throws IOException
	{
		File tempFile;
		dupFiles = dupFiles + 1;
		boolean fileExists = file.getName().equalsIgnoreCase(file.getName());
		if(fileExists == true)
		{	
			
			tempFile = new File(archivePath+ "\\"+file.getName());
			tempFile.delete();
		}
		Path temp = Files.move
		        (Paths.get(file+""), 
		        Paths.get(archivePath + "\\" + file.getName()));
		 
		        if(temp != null)
		        {
		        	logger.info("File moved successfully");
		        }
		        else
		        {
		        	logger.warn("Failed to move the file");
		        }
		        
	}
	
	

}
