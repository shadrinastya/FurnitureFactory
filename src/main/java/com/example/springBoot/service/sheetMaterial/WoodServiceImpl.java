package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Wood;
import com.example.springBoot.repository.sheetMaterial.WoodBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class WoodServiceImpl extends SheetMaterialServiceImpl<Wood, WoodBaseRepository> {
    public WoodServiceImpl(WoodBaseRepository repository) {
        super(repository);
    }
}
