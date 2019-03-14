package com.ebook.domain.request;

import java.math.BigDecimal;

/**
 * 订单支付记录请求参数
 */
public class OrderPaymentLogRequest {

    // 订单编号
    private String orderId;

    // 订单价格
    private BigDecimal orderPrice;

    public OrderPaymentLogRequest() {
    }

    public OrderPaymentLogRequest(String orderId, BigDecimal orderPrice) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
