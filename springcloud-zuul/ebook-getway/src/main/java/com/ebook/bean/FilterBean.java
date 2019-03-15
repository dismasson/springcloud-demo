package com.ebook.bean;

import com.ebook.filter.GrayLevelFiler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterBean {
    @Bean
    public GrayLevelFiler preRequestLogFilter() {
        return new GrayLevelFiler();
    }
}
