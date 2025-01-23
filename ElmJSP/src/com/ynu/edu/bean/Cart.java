package com.ynu.edu.bean;

/**
 * @ClassName Cart
 * @Description 购物车类
 * @Author Echo-Nie
 * @Date 2024/12/9 12:28
 * @Version V1.0
 */
public class Cart {
    private Integer id;
    private Integer productId;
    private Integer userId;
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart [id=" + id + ", productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + "]";
    }

}
