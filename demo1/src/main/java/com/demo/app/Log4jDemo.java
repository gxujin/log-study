package com.demo.app;

import org.apache.log4j.Logger;

public class Log4jDemo {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log4jDemo.class);

        logger.info("log4j test");
    }
}
