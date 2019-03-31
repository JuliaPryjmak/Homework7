package com.epam.hometask7;

public class Triangle extends Shape {
    private double a;
    private double b;
    final private double c = 2;


    public Triangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }


    @Override
    public String toString() {
        return super.toString() +
                "; side = " + a + "; height = " + b;
    }


    @Override
    public double calcArea() {  //чи можна метод так зробити щоб видавав без крапки і нуль
        if (a < 0 || b < 0) {

            return 0.0;
        }
        if (a == 0 || b == 0) {

            return 0.0;
        }

        return (a * b) / 2;
    }
    @Override
    public void showTheText(){
        System.out.println("The square of Triangle is: ");
    }

}