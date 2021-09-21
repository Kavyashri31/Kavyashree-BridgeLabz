package com.HelloWorldJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.info("this is info message");
        LOG.debug("this is debug message");
        LOG.warn("this is warn message");
        LOG.error("this is error message");
        LOG.fatal("this is fatal message");
    }
}
