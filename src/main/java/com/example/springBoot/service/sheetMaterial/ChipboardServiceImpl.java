package com.example.springBoot.service;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.repository.ChipboardRepository;
import org.springframework.stereotype.Service;

@Service
public class ChipboardServiceImpl extends SheetMaterialServiceImpl<Chipboard, ChipboardRepository> {
    public ChipboardServiceImpl(ChipboardRepository repository) {
        super(repository);
    }
}
