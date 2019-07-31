package com.alibaba.jstorm.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JstormUiApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JstormUiApplication.class);
        application.setWebEnvironment(true);
        application.run(args);
    }

}
