package com.example.springBoot.controller.sheetMaterial;

import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.service.sheetMaterial.CommonSheetMaterialServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sheet_materials")
public class CommonSheetMaterialController extends AbstractSheetMaterialRestController <SheetMaterial, CommonSheetMaterialServiceImpl>  {

        private CommonSheetMaterialServiceImpl service;

        public CommonSheetMaterialController(CommonSheetMaterialServiceImpl service) {
                super(service);
        }

}



