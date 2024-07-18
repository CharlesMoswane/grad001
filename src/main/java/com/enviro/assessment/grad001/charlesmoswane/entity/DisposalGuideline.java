package com.enviro.assessment.grad001.charlesmoswane.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DisposalGuideline {
    @Id
    private int id;
    private String name;
    private String description;
}
