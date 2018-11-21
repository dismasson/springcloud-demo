package com.sxli.springcloud.sleuth.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品模型
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 3626977674705726521L;

    // 商品ID
    String productId;

    // 商品名称
    String productName;

    // 商品主图片
    String mainImg;

    // 商品图片
    String images;

    // 商品价格
    BigDecimal price;

    // 商品详情
    String productDetail;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}
