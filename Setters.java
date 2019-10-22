package com.example.setters;

public class Setters {
    public static void main(String[] args){
        Products newProduct = new Products("Billy", "Plastic");
        System.out.println("New product name is " + newProduct.setName("Rocky") + " and is made out of "
        + newProduct.setMaterial("wood") + ".");
    }
}
