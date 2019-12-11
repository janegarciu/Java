package com.jenika.oop.Lab1.task1;

public class Main {


        public static void main(String[] args) {
            Lab1.task1.Monitor mon1 = new Lab1.task1.Monitor();
            Lab1.task1.Monitor mon2 = new Lab1.task1.Monitor();
            mon1.color = "White";
            mon2.color = "Blue";
            mon1.dimension = 24;
            mon2.dimension = 21;
            mon1.resolution = 18;
            mon2.resolution = 17;
            System.out.println(mon1.color+" "+mon1.dimension+" "+mon1.resolution);
            System.out.println(mon2.color+" "+mon2.dimension+" "+mon2.resolution);
            Lab1.task1.Comparator comparator = new Lab1.task1.Comparator();
            comparator.compare(mon1.dimension, mon2.dimension);
            comparator.compare(mon1.resolution, mon2.resolution);
        }
    }