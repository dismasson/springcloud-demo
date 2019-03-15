package com.ebook.controller;

import com.ebook.domain.request.OrderPaymentLogRequest;
import com.ebook.domain.response.OrderPaymentLogResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    /**
     * 默认支付记录演示
     *
     * @param params 支付记录参数
     * @return 支付记录结果
     */
    @PostMapping("/log")
    public OrderPaymentLogResponse defaultPayLogDemo(@RequestBody OrderPaymentLogRequest params) {
        // 支付结果为未支付
        byte status = 0;
        // 模拟录入支付记录结果并且返回
        OrderPaymentLogResponse payLog = new OrderPaymentLogResponse(params.getOrderId(), "10000007841", status);
        // 返回支付结果
        return payLog;
    }

}
