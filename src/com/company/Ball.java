package com.company;

import java.lang.*;
public class Ball {
    private String name;
    private int radius;
    public Ball(String n, int a){
        name = n;
        radius = a;
    }
    public Ball(String n){
        name = n;
        radius = 0;
    }
    public Ball(){
        name = "Pup";
        radius = 0;
    }
    public void setAge(int radius) {
        this.radius = radius;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.name+", radius "+this.radius;
    }
    public void Size(){
        System.out.println(name+" it have size "+Math.round(radius*radius*radius*4*3.14/3)+" cm^3");
    }
}

