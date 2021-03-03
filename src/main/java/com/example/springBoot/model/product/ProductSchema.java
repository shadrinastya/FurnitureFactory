package com.example.springBoot.model.product;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.enumClasses.ProductType;
import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.model.v1.Material;

import java.util.ArrayList;
import java.util.List;

public class ProductSchema {

    //private List<SheetMaterial> productSchema;

    public static List<SheetMaterial> setProductSchema (ProductType type, Color color) {
        List<SheetMaterial> productSchema = new ArrayList<>();
        switch (type) {
            case DESK:
                SheetMaterial mdf = new Mdf(color, 1);
                SheetMaterial chipboard = new Chipboard(color, 4);
                productSchema.add(mdf);
                productSchema.add(chipboard);
                return productSchema;
            default:
                return null;
        }
    }
}
