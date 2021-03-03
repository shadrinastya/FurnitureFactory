package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.enumClasses.Color;
import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.repository.sheetMaterial.SheetMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SheetMaterialServiceImpl <T extends SheetMaterial, R extends SheetMaterialRepository <T>> implements SheetMaterialService<T> {


    private final R repository;

    @Autowired
    public SheetMaterialServiceImpl(R repository) {
        this.repository = repository;
    }


    @Override
    public void save(T newMaterial) {
        T material = findByMaterial(newMaterial);
        if (material!=null) {
            int id = material.getId();
            int countMaterials = material.getMaterialsCount();
            newMaterial.setId(id);
            newMaterial.setMaterialsCount(newMaterial.getMaterialsCount()+countMaterials);
        }
        repository.save(newMaterial);
    }

    @Override
    public void update(T newMaterial) {
        T material = findByMaterial(newMaterial);
        int materialsCount = newMaterial.getMaterialsCount();
        material.setMaterialsCount(materialsCount);
        repository.save(material);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(int id) {
        return repository.getOne(id);
    }

    @Override
    public T findByMaterial(T material) {
        return repository.findByMaterial(material);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

}
