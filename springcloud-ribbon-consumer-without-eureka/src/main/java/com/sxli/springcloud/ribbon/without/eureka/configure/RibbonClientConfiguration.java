package com.sxli.springcloud.ribbon.without.eureka.configure;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RibbonClientConfigure必须使用@Configuration进行注解，但是不能被scan到，否则变成全局对旬会被所有client使用。
 * 它必须放在scan外的包中，或者是使用scan中的exclude排队掉。这些配置都会在子ApplicationContext中被创建
 */
@Configuration
public class RibbonClientConfiguration {

    /**
     *  Ribbon负载均衡方式-官方有7种可用负载方式
     *  RandomRule  随机负载均衡
     *  ZoneAvoidanceRule 按照eureka划分的区域(如果在eureka客户端指定区域),会剔除掉不可用的区域以及那些高并发的区域
     *  BestAvailableRule 选择当前最少并发请求的server
     *  WeightedResponseTimeRule 权重,根据server响应时间来判断权重
     *  RetryRule 带有重试机制的负载均衡
     *  RoundRobinRule 轮询，默认负载均衡方式
     *  AvailabilityFilteringRule 过滤掉一直连接失败被标记的server（熔断机制）,并且过滤掉那些并发量很高的server
     */
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        WeightedResponseTimeRule rule = new WeightedResponseTimeRule();
        rule.initWithNiwsConfig(config);
        return rule;
    }
}
