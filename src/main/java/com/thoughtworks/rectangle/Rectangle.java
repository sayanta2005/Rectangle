package com.thoughtworks.rectangle;

class Rectangle{
    private final double length;
    private final double breadth;
    Rectangle(double length, double breadth){
        
        if(length<0 || breadth<0){
            throw new IllegalArgumentException("Values must be positive");
        }
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}