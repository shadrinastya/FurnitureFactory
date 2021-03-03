package com.example.springBoot.service.sheetMaterial;

import com.example.springBoot.model.material.Chipboard;
import com.example.springBoot.model.material.Mdf;
import com.example.springBoot.model.material.SheetMaterial;
import com.example.springBoot.model.enumClasses.MaterialType;
import com.example.springBoot.repository.sheetMaterial.SheetMaterialRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonSheetMaterialServiceImpl implements SheetMaterialService<SheetMaterial> {

    private final MdfServiceImpl mdfService;
    private final ChipboardServiceImpl chipboardService;
    private final SheetMaterialRepository sheetMaterialRepository;

    public CommonSheetMaterialServiceImpl(MdfServiceImpl mdfService, ChipboardServiceImpl chipboardService,
            SheetMaterialRepository sheetMaterialRepository) {
        this.mdfService = mdfService;
        this.chipboardService = chipboardService;
        this.sheetMaterialRepository = sheetMaterialRepository;
    }

    @Override
    public void save(SheetMaterial newMaterial) {
        MaterialType type = newMaterial.getMaterialType();
        switch (type) {
            case MDF:
                mdfService.save((Mdf) newMaterial);
                break;
            case CHIPBOARD:
                chipboardService.save((Chipboard) newMaterial);
        }
    }

    @Override
    public void update(SheetMaterial newMaterial) {
        MaterialType type = newMaterial.getMaterialType();
        switch (type) {
            case MDF:
                mdfService.update((Mdf) newMaterial);
                break;
            case CHIPBOARD:
                chipboardService.update((Chipboard) newMaterial);
        }
    }

    @Override
    public List<SheetMaterial> findAll() {
        return sheetMaterialRepository.findAll();
    }

    @Override
    public SheetMaterial findById(int id) {
        List<SheetMaterial> materials = findAll();
        SheetMaterial material = materials.stream()
                .filter(m -> m.getId() == id)
                .findFirst().orElse(null);
        return material;

    }

    @Override
    public SheetMaterial findByMaterial(SheetMaterial material) {

        MaterialType type = material.getMaterialType();
        switch (type) {
            case MDF:
                return mdfService.findByMaterial((Mdf) material);
            case CHIPBOARD:
                return chipboardService.findByMaterial((Chipboard) material);
            default:
                return null;
        }
    }

    @Override
    public void deleteById(int id) {

        SheetMaterial material = findById(id);

        MaterialType type = material.getMaterialType();
        switch (type) {
            case MDF:
                mdfService.deleteById(id);
                break;
            case CHIPBOARD:
                chipboardService.deleteById(id);
                break;

        }
    }
}
