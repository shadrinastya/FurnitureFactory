package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.repository.sheetMaterial.ChipboardRepository;
import org.springframework.stereotype.Service;

@Service
public class ChipboardServiceImpl extends SheetMaterialServiceImpl<Chipboard, ChipboardRepository> {
    public ChipboardServiceImpl(ChipboardRepository repository) {
        super(repository);
    }
}
