package com.xploretown.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class WebConfig {

    @Bean
    public CorsFilter corsFilter(){

        // Create a set of rules for the application to be followed
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of("http://localhost:5173"));
        config.setAllowedMethods(List.of("GET","POST","DELETE","PUT"));
        config.setAllowedHeaders(List.of("*"));
        config.setAllowCredentials(true);

        // Create a rulebook with the set of rules
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);

        // Apply the rulebook to the Entire Application
        return new CorsFilter(source);
    }
}
