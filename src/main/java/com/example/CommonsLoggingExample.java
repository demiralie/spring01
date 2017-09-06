package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());

	public static void main(String[] args) {
		
		log2.log(Level.INFO, "Java Standard logger");

		// 낮은 level부터...
		log.trace("Commons TRACE 1. level log");
		log.debug("Commons DEBUG 2. level log");
		log.info("Commons INFO 3. level log");
		log.warn("Commons WARN 4. level log");
		log.error("Commons ERROR 5. level log");
		log.fatal("Commons FATAL 6. level log");
		
		log.info("###########################");

	}

}
