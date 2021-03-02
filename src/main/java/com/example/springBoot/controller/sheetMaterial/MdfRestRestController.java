package com.example.springBoot.controller;

import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.service.MdfServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mdf")
public class MdfRestRestController extends AbstractSheetMaterialRestController<Mdf, MdfServiceImpl> {

    public MdfRestRestController(MdfServiceImpl service) {
        super(service);
    }
}
