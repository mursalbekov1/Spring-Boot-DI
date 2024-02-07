package com.example.dependencyinjection.config;

import com.example.dependencyinjection.model.BWPrinter;
import com.example.dependencyinjection.model.ColorPrinter;
import com.example.dependencyinjection.model.IPrintable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    IPrintable getPrinter() {
        return new ColorPrinter();
    }
}
