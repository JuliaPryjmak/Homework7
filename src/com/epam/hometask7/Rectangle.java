package com.epam.hometask7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "; width = " + width + "; height = " + height;
    }


    @Override
    public double calcArea() {  //чи можна метод так зробити щоб видавав без крапки і нуль
        if(width < 0 || height < 0){

         //   System.out.println("You have entered a negative number: " );
            return 0.0;
        }
        if(width == 0 || height == 0){


            return 0.0;
        }
        return  width * height;
    }
    @Override
    public void showTheText(){
        System.out.println("The square of Rectangle is: ");
    }

}
