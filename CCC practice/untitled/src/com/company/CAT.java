package com.company;

public class CAT {
    private String name;
    private String color;
    private float weight;
    private String breed;

    public CAT(String name, String color, float weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public CAT (String breed) {
        this.breed = breed;
    }

    public CAT() {

    }

    //void CAT (String food) {
        //System.out.println(CAT + "eats" + food);
    public void ShowMyInfo(){
        System.out.println("name: " + name);
        System.out.println("color " +color);
        System.out.println("weight: " +weight);
    }

    }

