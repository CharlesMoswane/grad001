package com.enviro.assessment.grad001.charlesmoswane.dao;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
