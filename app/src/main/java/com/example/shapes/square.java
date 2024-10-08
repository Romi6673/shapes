package com.example.shapes;

public class square extends shape {
    public double s;

    public square (double side){
        this.s=side;
    }

    @Override
    public void calculatePerimeter(){
        System.out.println (s*4);
    }
    @Override
    public void calculateArea(){
        System.out.println (s*s);
    }
}
