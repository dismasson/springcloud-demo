package com.ebook.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import io.jmnarloch.spring.cloud.ribbon.support.RibbonFilterContextHolder;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

public class GrayLevelFiler extends ZuulFilter {

    @Override
    public String filterType() {
        return ROUTE_TYPE;
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
        if (true) {
            RibbonFilterContextHolder.getCurrentContext()
                    .add("loadbance", "new");
        }
        return null;
    }

}
