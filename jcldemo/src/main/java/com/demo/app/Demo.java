package com.demo.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Demo {

    public static void main(String[] args) {
        Log logger = LogFactory.getLog(Demo.class);

        logger.info("commons-logging test");
    }
}
