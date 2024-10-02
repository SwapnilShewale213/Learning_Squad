package com.learning_sqaud;

public class MethodOverLoadingDemo {

    int a ,b, result;

//    public MethodOverLoadingDemo(int a, int b, int result) {
//        this.a = a;
//        this.b = b;
//    }

    public  void add(int a , int b){
        result = a + b;
        System.out.println(result);
    }

    public  void add(int a , int b, int c){
        result = a + b + c;
        System.out.println(result);
    }

}
