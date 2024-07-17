package com.enviro.assessment.grad001.charlesmoswane.dao;

import com.enviro.assessment.grad001.charlesmoswane.entity.DisposalGuideline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "disposalGuidelines", path = "disposalGuidelines")
public interface DisposalGuidelineRepository extends JpaRepository<DisposalGuideline, Integer> {
}
