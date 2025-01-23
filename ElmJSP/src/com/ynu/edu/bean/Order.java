package com.ynu.edu.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Order
 * @Description 订单
 * @Author Echo-Nie
 * @Date 2024/12/9 12:33
 * @Version V1.0
 */
public class Order {
    private Integer id;
    private Integer userId;
    private BigDecimal payment;
    private Date payTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", userId=" + userId + ", payment=" + payment + ", payTime=" + payTime + "]";
    }

}
