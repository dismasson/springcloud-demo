package com.ebook.service;

import com.ebook.domain.request.OrderPaymentLogRequest;
import com.ebook.domain.response.OrderPaymentLogResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 支付服务本地化调用
 */
@FeignClient(name = "ebook-payment")
public interface PayMentService {

    /**
     * 创建订单支付记录
     *
     * @param params 订单支付记录参数
     * @return 支付详情
     */
    @PostMapping("/pay/log")
    OrderPaymentLogResponse newPayLog(OrderPaymentLogRequest params);

}
