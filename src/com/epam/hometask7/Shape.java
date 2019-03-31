package com.epam.hometask7;

public class Shape {
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        String str="";
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color;
    }


    public double calcArea() {

    return 0.0;
}
    public void showTheText(){
    System.out.println("The square is: ");
}




}
