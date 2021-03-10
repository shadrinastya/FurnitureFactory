package com.example.springBoot.controller.sheetMaterial;

import com.example.springBoot.model.material.Wood;
import com.example.springBoot.service.sheetMaterial.WoodServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("woods")
public class WoodRestController extends AbstractSheetMaterialRestController<Wood, WoodServiceImpl> {
    public WoodRestController(WoodServiceImpl service) {
        super(service);
    }
}
