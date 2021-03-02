package com.example.springBoot.repository;

import com.example.springBoot.model.material.Mdf;
import org.springframework.stereotype.Repository;

@Repository
public interface MdfRepository extends SheetMaterialRepository<Mdf> {
}
