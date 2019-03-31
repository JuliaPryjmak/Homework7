package com.epam.hometask7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Shape[] shapes = new Shape[]{new Rectangle(3,4, "blue"), new Rectangle(4,5,"blue"), new Rectangle(5,6,"blue"), new Rectangle(6,7,  "blue"),
     new Circle(2, "grey"), new Circle(3, "grey"), new Circle(4, "grey"), new Triangle(2,3, "green"), new Triangle(3,4, "green")};
        System.out.println("The arrays is: ");
        System.out.println(Arrays.toString(shapes));

        for(Shape element : shapes){
            element.showTheText();
            System.out.println( element.calcArea());
        }
           Main exampleClass = new Main();
        System.out.println("The total square is: " + totalSquare(shapes));



        System.out.println("The total amount square each of element is: " + Arrays.toString(totalSquareEachOfElement(shapes)));



    }
    public static double totalSquare(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            double number = shapes[i].calcArea();
            sum = sum + number;

        }
    return sum;
    }

    public static double[] totalSquareEachOfElement(Shape[] shapes){
        double[] totalSquareOfElement = new double[3];
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (int i = 0; i < shapes.length; i++) {

            if(shapes[i] instanceof Rectangle){
                sum1 = sum1 + shapes[i].calcArea();
            }
            if(shapes[i] instanceof Circle){
                sum2 = sum2 + shapes[i].calcArea();
            }
            if(shapes[i] instanceof Triangle){
                sum3 = sum3 + shapes[i].calcArea();
            }

        }
        totalSquareOfElement[0] = sum1;
        totalSquareOfElement[1] = sum2;
        totalSquareOfElement[2] = sum3;



        return totalSquareOfElement;
    }



}
