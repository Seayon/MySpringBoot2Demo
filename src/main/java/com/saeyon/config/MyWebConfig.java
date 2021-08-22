package com.saeyon.config;

import com.saeyon.bean.OriginPet;
import com.saeyon.bean.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new Converter<String, OriginPet>() {

            @Override
            public OriginPet convert(String source) {
                String[] split = source.split(",");
                OriginPet pet = new OriginPet();
                pet.setName(split[0]);
                pet.setWeight(Double.valueOf(split[1]));
                return pet;
            }
        });
        WebMvcConfigurer.super.addFormatters(registry);
    }
}
