package com.ebook.bean;

import com.ebook.filter.GrayLevelFiler;
import com.ebook.filter.ResponselFiler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterBean {

    /**
     * 灰度环境 路由过滤器，作用是添加灰度环境标识
     * @return
     */
    @Bean
    public GrayLevelFiler grayLevelFiler() {
        return new GrayLevelFiler();
    }

    /**
     * 灰度环境 响应过滤器，作用是清除线程中灰度环境标识
     * @return
     */
    @Bean
    public ResponselFiler responselFiler() {
        return new ResponselFiler();
    }
}
