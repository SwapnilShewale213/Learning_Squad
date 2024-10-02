package com.learning_sqaud;

public class Main {

    public static void main(String[] args) {

        EncapsulationDemo e = new EncapsulationDemo();

        Calcaulator c = new Add(4,3);


        // here method call
        //System.out.println("Nice to meet you " + e.doSomeOperations());


//        e.setFirstName("Sagar");
//        e.setLastName("Ahire");
//        e.setRollNo(96);
//        e.setAddress("California");
//
//        System.out.println( "First Name: " + e.getFirstName());
//        System.out.println("Last Name: " + e.getLastName());
//        System.out.println("Roll No : " + e.getRollNo());
//        System.out.println("Address :" + e.getAddress());


        MethodOverLoadingDemo m = new MethodOverLoadingDemo();
        int a = 3, b = 5;
        m.add(a,b);
        m.add(3,5,5);

    }
}
