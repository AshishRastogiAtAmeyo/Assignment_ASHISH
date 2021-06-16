package com.ameyo.java.assignment;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * The Class Log.
 * 
 * @author ashish rastogi
 * 
 */
public class Log {
	private final static Logger LOGGER = Logger.getLogger("test");
	private FileHandler fh;
	static
	{
		System.setProperty("java.util.logging.SimpleFormatter.format",
	              "[%1$tF %1$tT] [%4$-7s]  %5$s %n");
	}

	/**
	 * Instantiates a new log.
	 * 
	 * @param file_name the file name
	 */
	public Log(String file_name) {

		File theDir = new File("Log");
		if (!theDir.exists()) {
//			create Log directory
			theDir.mkdirs();
		}
		File file = new File(theDir.toString() + "/" + file_name);
		if (!file.exists()) {
//			create log file in Log directory
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fh = new FileHandler(theDir.toString() + "/" + file_name, true);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.CONFIG);
		LOGGER.addHandler(ch);
	}

	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public Logger getLogger() {
		return LOGGER;
	}

}
