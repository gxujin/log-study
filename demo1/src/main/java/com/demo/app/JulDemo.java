package com.demo.app;

import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Logger;

public class JulDemo {

    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        Logger logger = Logger.getLogger(JulDemo.class.getName());

        logger.info("java.util.logging test");
    }
}
