package com.example.springBoot.model.material;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.enumClasses.MaterialType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("chipboard")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Chipboard extends SheetMaterial {

    public Chipboard(Color color, int materialsCount) {
        super(color, materialsCount);
        setMaterialType(MaterialType.CHIPBOARD);
    }
    public Chipboard(){
        setMaterialType(MaterialType.CHIPBOARD);
    };
}
