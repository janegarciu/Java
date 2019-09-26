package com.jenika.oop.Lab2.task3;

public class Box {
    double height;
    double width;
    double depth;

   Box(){
       this.height = 1;
       this.width = 1;
       this.depth = 1;
       System.out.println("Default constructor: "+this.height+" "+this.width+" "+this.depth);

   }

   Box(int a){
       this.height = a;
       this.depth = a;
       this.width = a;

       System.out.println("Constructor with one parameter: "+this.width+" "+this.height+" "+this.depth);
   }

    Box(int height, int depth, int width){
        this.height = height;
        this.depth = depth;
        this.width = width;
        System.out.println("Constructor with three parameters: "+this.height+" "+this.depth+" "+this.width);

    }
}

