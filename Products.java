package com.example.setters;

public class Products {

    private String name;
    private String material;

    public Products(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String setName(String newName) {
        return name = newName;
    }

    public String setMaterial(String newMaterial) {
        return material = newMaterial;
    }
}
