package com.learning_sqaud;

public class Calcaulator {

     int num1;
     int num2;
     int result;
// This keyword is used for to refer current object of the class.
// we can use this keyword for calling or refer data members and methods.

    public Calcaulator(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
}
class Add extends  Calcaulator{

    public Add(int num1 , int num2){
        super(num1 , num2);  // Super keyword is used for calling parent class constructor or methods or data members in child class.
        int result = num1 + num2;
        System.out.println( "result:" + result);

    }
}
