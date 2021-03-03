package com.example.springBoot.repository.sheetMaterial;

import com.example.springBoot.model.material.SheetMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SheetMaterialRepository <T extends SheetMaterial> extends JpaRepository<T, Integer>, SheetMaterialRepo<T> {

}
