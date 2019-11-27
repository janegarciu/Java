package com.jenika.oop.Lab5;

public class J extends I {
    protected String j= "j";

    protected J(X x)
    {
        super(x);
        System.out.println(j);
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
//                ", x=" + x +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
//                ", x=" + x +
                '}';
    }
}
