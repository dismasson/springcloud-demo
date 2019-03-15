package com.ebook.filter;

import com.netflix.zuul.ZuulFilter;
import io.jmnarloch.spring.cloud.ribbon.support.RibbonFilterContextHolder;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;

public class ResponselFiler extends ZuulFilter {

    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RibbonFilterContextHolder.getCurrentContext().remove("loadbance");
        return null;
    }

}
