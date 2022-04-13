package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogbackDemo.class);

        logger.info("logback test");
    }
}
