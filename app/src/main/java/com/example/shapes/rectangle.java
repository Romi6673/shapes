package com.example.shapes;

public class rectangle extends shape {
    public double sideX;
    public double sideY;


    public rectangle (double sX, double sY){
        this.sideX=sX;
        this.sideY=sY;
    }

    @Override
    public void calculatePerimeter(){
        System.out.println (sideX*2+sideY*2);
    }
    @Override
    public void calculateArea(){
        System.out.println (sideX*sideY);
    }
}
