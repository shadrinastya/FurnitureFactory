
package com.example.springBoot.service;

import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.repository.MdfRepository;
import org.springframework.stereotype.Service;


@Service
public class MdfServiceImpl extends SheetMaterialServiceImpl<Mdf, MdfRepository> {

    public MdfServiceImpl(MdfRepository repository) {
        super(repository);
    }
}
