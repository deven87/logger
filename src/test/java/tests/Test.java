package tests;

import loggers.FrameworkLogger;

public class Test {

	public static void main(String[] args) {
		
		FrameworkLogger.getLogger().debug("test debug logger");


		FrameworkLogger.getLogger().info("test info logger");

		FrameworkLogger.getLogger().debug("test debug logger");
		FrameworkLogger.getLogger().info("test info2 logger");

	}

}
