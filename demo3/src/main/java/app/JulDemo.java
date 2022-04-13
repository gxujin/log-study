package app;

import java.util.logging.Logger;

public class JulDemo {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(JulDemo.class.getName());

        logger.info("java.util.logging test");
    }
}
