package com.thoughtworks.rectangle;

class Rectangle{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    Rectangle(int length, int breadth){
        
        if(length<0 || breadth<0){
            throw new IllegalArgumentException("Values must be positive");
        }
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }


}