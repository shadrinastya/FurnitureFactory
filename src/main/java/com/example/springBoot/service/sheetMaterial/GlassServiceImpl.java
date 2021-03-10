package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Glass;
import com.example.springBoot.repository.sheetMaterial.GlassBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class GlassServiceImpl extends SheetMaterialServiceImpl<Glass, GlassBaseRepository> {

    public GlassServiceImpl(GlassBaseRepository repository) {
        super(repository);
    }
}
