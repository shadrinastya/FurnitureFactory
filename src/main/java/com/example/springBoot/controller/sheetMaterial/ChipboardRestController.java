package com.example.springBoot.controller.sheetMaterial;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.service.sheetMaterial.ChipboardServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chipboards")
public class ChipboardRestController extends AbstractSheetMaterialRestController<Chipboard, ChipboardServiceImpl> {

    public ChipboardRestController(ChipboardServiceImpl service) {
        super(service);
    }
}
