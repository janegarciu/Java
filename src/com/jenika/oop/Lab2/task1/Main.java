package com.jenika.oop.Lab2.task1;

public class Main {
    public static void main(String[] args) {

        //Default constructor
        Box box1 = new Box();

        //One parameter constructor
        Box box3 = new Box(5);

        //Three parameters constructor
        Box box2 = new Box(6, 7, 8);


        System.out.println(box1.calculateArea()+" "+box1.calculateV());
        System.out.println(box2.calculateArea()+" "+box2.calculateV());
        System.out.println(box3.calculateArea()+" "+box3.calculateV());
    }


}



