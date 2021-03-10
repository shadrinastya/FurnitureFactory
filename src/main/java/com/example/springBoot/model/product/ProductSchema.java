package com.example.springBoot.model.product;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.enumClasses.ProductType;
import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.model.material.Wood;

import java.util.ArrayList;
import java.util.List;

public class ProductSchema {

    public static List<SheetMaterial> setProductSchema(ProductType type, Color color, int productCount) {
        List<SheetMaterial> productSchema = new ArrayList<>();
        switch (type) {
            case DESK:
                SheetMaterial m1 = new Mdf(color, productCount);
                SheetMaterial m2 = new Wood(color, 4 * productCount);
                productSchema.add(m1);
                productSchema.add(m2);
                return productSchema;
            default:
                return null;
        }
    }
}
