package com.example.springBoot.controller;

import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.service.CommonSheetMaterialServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sheet_materials")
public class CommonSheetMaterialController extends AbstractSheetMaterialRestController <SheetMaterial, CommonSheetMaterialServiceImpl>  {

        private CommonSheetMaterialServiceImpl service;

        public CommonSheetMaterialController(CommonSheetMaterialServiceImpl service) {
                super(service);
        }


/*
    private CommonSheetMaterialServiceImpl sheetMaterialService;

    @Autowired
    public CommonSheetMaterialController(CommonSheetMaterialServiceImpl sheetMaterialService) {
        this.sheetMaterialService = sheetMaterialService;
    }

    @GetMapping
    public ResponseEntity<List<SheetMaterial>> getAll() {
        List<SheetMaterial> materials = sheetMaterialService.findAll();

        if (materials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(materials, HttpStatus.OK);
    }*/
}



