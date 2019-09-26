package com.jenika.oop.Lab2.task2;

public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.pop();
        System.out.println("Print the queue:" + queue1.list);

        Queue queue2 = new Queue(1000);
        queue2.push(10);
        queue2.push(20);
        queue2.push(30);
        queue2.pop();
        System.out.println("Print the queue with parameter:"+queue2.list);



    }

}
