package com.example.springBoot.controller.sheetMaterial;

import com.example.springBoot.model.material.Glass;
import com.example.springBoot.service.sheetMaterial.GlassServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("glasses")
public class GlassRestController extends AbstractSheetMaterialRestController<Glass, GlassServiceImpl> {
    public GlassRestController(GlassServiceImpl service) {
        super(service);
    }
}
