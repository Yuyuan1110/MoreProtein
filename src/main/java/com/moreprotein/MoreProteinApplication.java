package com.moreprotein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.config.server.config.ConfigServerMvcConfiguration;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class, ConfigServerMvcConfiguration.class, DataSourceAutoConfiguration.class})
public class MoreProteinApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoreProteinApplication.class, args);
    }
}
