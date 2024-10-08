package com.example.shapes;

public class triangle extends shape{

    public double hight;
    public double base;
    public double shok1;
    public double shok2;


    public triangle (double h, double b, double s1 , double s2){
        this.hight=h;
        this.base=b;
        this.shok1=s1;
        this.shok2=s2;
    }
    @Override
    public void calculatePerimeter(){
        System.out.println (base+shok1+shok2);
    }
    @Override
    public void calculateArea(){
        System.out.println ((hight*base)/2);
    }

}
