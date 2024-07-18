package com.enviro.assessment.grad001.charlesmoswane.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class WasteCategory {
    @Id
    private int id;
    private String name;
    private String description;

    public WasteCategory() {
    }

    public WasteCategory(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public WasteCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
