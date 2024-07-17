package com.enviro.assessment.grad001.charlesmoswane.entity;

import lombok.Data;

@Data
public class WasteCategory {
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
