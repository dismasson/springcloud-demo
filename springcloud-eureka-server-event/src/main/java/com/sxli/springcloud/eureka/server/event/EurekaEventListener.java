package com.sxli.springcloud.eureka.server.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * eureka 事件监听类
 */
@Component
public class EurekaEventListener {

    // 日志对象
    private static final Logger logger = LoggerFactory.getLogger(EurekaEventListener.class);

    /**
     * 微服务注册成功事件监听
     */
    @EventListener
    public void event(EurekaInstanceRegisteredEvent event){
        // 获取客户端自定义值map
        Map<String, String> InstanceMetadata = event.getInstanceInfo().getMetadata();
        logger.info(String.format("服务:%s成功注册,版本为:%s",InstanceMetadata.get("serverName"),InstanceMetadata.get("version")));
    }

    /**
     * 微服务注销下线事件监听
     */
    @EventListener
    public void event(EurekaInstanceCanceledEvent event){
        String appName = event.getAppName();
        String serverId = event.getServerId();
        logger.info(String.format("服务:%s已经注销,ID为:%s",appName,serverId));
    }
}
