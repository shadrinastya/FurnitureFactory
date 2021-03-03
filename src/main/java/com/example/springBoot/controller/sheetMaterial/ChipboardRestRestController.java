package com.example.springBoot.controller.sheetMaterial;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.service.sheetMaterial.ChipboardServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chipboard")
public class ChipboardRestRestController extends AbstractSheetMaterialRestController<Chipboard, ChipboardServiceImpl> {

    public ChipboardRestRestController(ChipboardServiceImpl service) {
        super(service);
    }
}
