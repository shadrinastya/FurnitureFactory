package com.example.springBoot.model.product;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.enumClasses.ProductType;
import com.example.springBoot.model.material.SheetMaterial;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Inheritance
public abstract class AbstractProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private ProductType productType;

    private Color color;

    @Min(value = 0)
    private int productCount;

    public AbstractProduct(Color color, @Min(value = 0) int productCount) {
        this.color = color;
        this.productCount = productCount;
    }

    public AbstractProduct() {
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

}
