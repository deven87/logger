package loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrameworkLogger {

	private static final Logger logger = LoggerFactory.getLogger(FrameworkLogger.class);


	public static Logger getLogger() {

		return logger;
	}



}
