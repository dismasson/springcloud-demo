package com.sxli.springcloud.sleuth.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单模型
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -1060003897835603832L;

    // 订单编号
    String orderId;

    // 下单用户
    String userId;

    // 创建时间
    Date createDate;

    // 支付时间
    Date payDate;

    // 支付金额
    BigDecimal payMoney;

    // 订单状态
    Integer orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}
