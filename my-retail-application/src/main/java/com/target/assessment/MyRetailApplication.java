package com.target.assessment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRetailApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyRetailApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting MyRetail application...");
        SpringApplication.run(MyRetailApplication.class, args);
    }

}
