package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.repository.sheetMaterial.MdfBaseRepository;

import org.springframework.stereotype.Service;


@Service
public class MdfServiceImpl extends SheetMaterialServiceImpl<Mdf, MdfBaseRepository> {

    public MdfServiceImpl(MdfBaseRepository repository) {
        super(repository);
    }
}
