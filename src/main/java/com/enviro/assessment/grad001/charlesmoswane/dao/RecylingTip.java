package com.enviro.assessment.grad001.charlesmoswane.dao;

import lombok.Data;

@Data
public class RecylingTip {
    private int id;
    private String name;
    private String description;

    public RecylingTip() {
    }

    public RecylingTip(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public RecylingTip(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
