package com.example.SellerMicroServices.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdb")
public class Product {

    @Column(name = "sellerid")
    private String sellerId;
    @Id
    @Column(name = "productid")
    private String productId;
    @Column(name = "productname")
    private String productName;
    @Column(name = "discription")
    private String discription;
    @Column(name = "productprice")
    private int productPrice;
    @Column(name = "sellingprice")
    private int sellingPrice;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "imageurl")
    private String imageUrl;
    @Column(name = "promo")
    private int promo;

    public Product() {
    }

    public Product(String sellerId, String productId, String productName, String discription, int productPrice, int sellingPrice, int quantity, String imageUrl, int promo) {
        this.sellerId = sellerId;
        this.productId = productId;
        this.productName = productName;
        this.discription = discription;
        this.productPrice = productPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.promo = promo;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sellerId='" + sellerId + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", discription='" + discription + '\'' +
                ", productPrice=" + productPrice +
                ", sellingPrice=" + sellingPrice +
                ", quantity=" + quantity +
                ", imageurl='" + imageUrl + '\'' +
                ", promo=" + promo +
                '}';
    }
}


