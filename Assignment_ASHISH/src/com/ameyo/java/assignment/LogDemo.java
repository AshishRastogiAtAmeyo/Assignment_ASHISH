package com.ameyo.java.assignment;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class DemoLogger
{
	public final Logger LOGGER;
	ConsoleHandler ch;
	
	
	public DemoLogger() {
		LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		ch = new ConsoleHandler();
		ch.setLevel(Level.OFF);
		LOGGER.addHandler(ch);
	}


	public void makeSomeLog(String logMessage)
	{
		LOGGER.log(Level.INFO, logMessage);
	}
}
public class LogDemo {
public static void main(String[] args) throws Exception {
	DemoLogger obj = new DemoLogger();
	obj.makeSomeLog("first log message");
	
	LogManager lgmgr = LogManager.getLogManager();
	Logger LOG = lgmgr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	LOG.log(Level.WARNING,"This is log message with level info");
	
	Logger my_log = new Log("sample.log").getLogger();
	my_log.setLevel(Level.INFO);
	my_log.info("This is info message");
	my_log.fine("This is fine message");
	my_log.severe("This is error message");
}
}
