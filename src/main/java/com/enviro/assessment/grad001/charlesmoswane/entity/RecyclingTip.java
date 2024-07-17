package com.enviro.assessment.grad001.charlesmoswane.entity;

import lombok.Data;

@Data
public class RecyclingTip {
    private int id;
    private String name;
    private String description;

    public RecyclingTip() {
    }

    public RecyclingTip(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public RecyclingTip(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
