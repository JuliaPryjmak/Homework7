package com.epam.hometask7;

import com.sun.istack.internal.FinalArrayList;

public class Circle extends Shape {
    private int radius;
    final private double PI = 3.14;


    public void setRadius(int radius) {

        this.radius = radius;

    }




    public Circle (int radius, String color){
        super(color);
        this.radius = radius;

    }

    @Override
    public String toString() {
        return  super.toString() +
                "; radius = " + radius;
    }


    @Override
    public double calcArea() {

        if(radius < 0 || radius == 0){

            return 0.0;
        }

        return  PI * (radius * radius);
    }
    @Override
    public void showTheText(){
        System.out.println("The square of circle is: ");
    }

}
