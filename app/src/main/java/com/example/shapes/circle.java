package com.example.shapes;

public class circle extends shape{

    public double r;

    public circle (double radius){
        this.r=radius;
    }

    @Override
    public void calculatePerimeter(){
        System.out.println (r*2*3.14159);
    }
    @Override
    public void calculateArea(){
        System.out.println (r*r*3.14159);
    }

}
