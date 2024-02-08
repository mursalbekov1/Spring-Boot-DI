package com.example.dependencyinjection.config;

import com.example.dependencyinjection.model.ColorPrinter;
import com.example.dependencyinjection.model.IPrintable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {

    @Value("${server.port}")
    private String port;

    @Bean
    IPrintable getPrinter() {
        log.info(port);
        return new ColorPrinter();
    }
}
