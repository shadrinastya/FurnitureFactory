package com.example.springBoot.repository;

import com.example.springBoot.model.material.Chipboard;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipboardRepository extends SheetMaterialRepository<Chipboard>  {
}
