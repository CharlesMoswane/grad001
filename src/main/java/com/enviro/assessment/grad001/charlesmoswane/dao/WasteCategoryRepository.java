package com.enviro.assessment.grad001.charlesmoswane.dao;

import com.enviro.assessment.grad001.charlesmoswane.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "wasteCategories", path = "wasteCategories")
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Integer> {
}