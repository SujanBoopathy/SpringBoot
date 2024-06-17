package com.example.spring_boot.taco;

public class Ingredients {
    public int id;
    public String name;
    public String type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
