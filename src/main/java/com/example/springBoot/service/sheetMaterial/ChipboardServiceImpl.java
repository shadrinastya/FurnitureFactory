package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.repository.sheetMaterial.ChipboardBaseRepository;

import org.springframework.stereotype.Service;

@Service
public class ChipboardServiceImpl extends SheetMaterialServiceImpl<Chipboard, ChipboardBaseRepository> {
    public ChipboardServiceImpl(ChipboardBaseRepository repository) {
        super(repository);
    }
}
