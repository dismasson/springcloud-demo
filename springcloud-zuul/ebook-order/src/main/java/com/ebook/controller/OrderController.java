package com.ebook.controller;

import com.ebook.domain.request.OrderPaymentLogRequest;
import com.ebook.domain.response.OrderPaymentLogResponse;
import com.ebook.domain.response.Response;
import com.ebook.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PayMentService payMentService;

    /**
     * 默认订单演示
     */
    @GetMapping("/default")
    public Response defaultOrderDemo() {
        // 默认订单编号
        String defaultOrder = "1000001";
        // 订单支付记录参数
        OrderPaymentLogRequest orderPayLog = new OrderPaymentLogRequest(defaultOrder, new BigDecimal(10));
        // 调用支付服务记录支付记录
        OrderPaymentLogResponse payLog = payMentService.newPayLog(orderPayLog);
        // 返回支付结果
        return new Response("这是新版的订单服务",payLog);
    }

}
