package com.dev.spring.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringServiceConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceConfigServerApplication.class, args);
    }

}
