package com.example.springBoot.service.product;

import com.example.springBoot.model.product.Desk;
import com.example.springBoot.repository.product.DeskRepositoryImpl;
import com.example.springBoot.service.sheetMaterial.CommonSheetMaterialServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DeskServiceImpl extends ProductServiceImpl<Desk, DeskRepositoryImpl> {

    public DeskServiceImpl(DeskRepositoryImpl repository, CommonSheetMaterialServiceImpl service) {
        super(repository, service);
    }
}