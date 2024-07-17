package com.enviro.assessment.grad001.charlesmoswane.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "wasteCategories", path = "wasteCategories")
public interface WasteCategoryRepository extends JpaRepository<WasteCategoryRepository, Integer> {
}
