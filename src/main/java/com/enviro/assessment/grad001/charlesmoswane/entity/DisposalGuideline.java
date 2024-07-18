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

    public DisposalGuideline() {
    }

    public DisposalGuideline(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public DisposalGuideline(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
