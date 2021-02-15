package com.example.springBoot.repository;


import com.example.springBoot.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

    //this method returns null if element not found
    default Material findByMaterial(Material material) {
        Material material1 = findAll().stream()
                .filter(m -> m.equals(material))
                .findFirst().orElse(null);
        return material1;
    }
}
