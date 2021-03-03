package com.example.springBoot;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.model.enumClasses.Color;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Creates new List of Material");
        List<SheetMaterial> materialList = new ArrayList<>();
        Mdf mdf = new Mdf(Color.WHITE, 12);
        Chipboard chipboard = new Chipboard(Color.ORANGE, 18);
        System.out.println(mdf);
        System.out.println(chipboard);
        materialList.add(mdf);
        materialList.add(chipboard);
        System.out.println("List created! " + materialList);
    }
}