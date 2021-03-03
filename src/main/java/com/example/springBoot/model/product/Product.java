package com.example.springBoot.model.product;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.enumClasses.ProductType;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Inheritance
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private ProductType productType;

    private Color color;

    @Min(value = 0)
    private int productCount;

    public Product(Color color, @Min(value = 0) int productCount) {
        this.color = color;
        this.productCount = productCount;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int materialsCount) {
        this.productCount = materialsCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productType=" + productType +
                ", color=" + color +
                ", productCount=" + productCount +
                '}';
    }
}
