package com.example.SofiaKnightsWeb.Home;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HomeConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/images/**")
                .addResourceLocations("file:D:\\Web Development 2021, 2022\\Sofia Knights Website\\SofiaKnightsWeb\\src\\main\\resources\\static\\images\\image1.png")
                .setCachePeriod(0);
    }
}