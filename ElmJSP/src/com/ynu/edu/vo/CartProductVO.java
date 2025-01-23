package com.ynu.edu.vo;

import java.math.BigDecimal;

/**
 * @ClassName CartProductVO
 * @Description 购物车视图
 * @Author Echo-Nie
 * @Date 2024/12/9 14:29
 * @Version V1.0
 */
public class CartProductVO {

    private Integer cartId;
    private String productName;
    private String productImage;
    private String productDetail;
    private BigDecimal productPrice;
    private Integer productStock;
    private Integer quantity;


    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
