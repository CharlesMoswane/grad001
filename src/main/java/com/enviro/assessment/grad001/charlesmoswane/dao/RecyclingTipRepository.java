package com.enviro.assessment.grad001.charlesmoswane.dao;

import com.enviro.assessment.grad001.charlesmoswane.entity.RecyclingTip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recyclingTips", path = "recyclingTips")
public interface RecyclingTipRepository extends JpaRepository<RecyclingTip, Integer> {
}
