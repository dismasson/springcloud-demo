package com.ebook.domain.response;

/**
 * 订单支付记录响应参数
 */
public class OrderPaymentLogResponse {

    // 订单编号
    private String orderId;

    // 支付记录编号
    private String paymentId;

    // 订单支付状态 0-未支付 1-已支付
    private byte paymentStatus;

    public OrderPaymentLogResponse() {
    }

    public OrderPaymentLogResponse(String orderId, String paymentId, byte paymentStatus) {
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public byte getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(byte paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
