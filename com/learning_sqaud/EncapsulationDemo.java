package com.learning_sqaud;

import java.util.Scanner;

public class EncapsulationDemo {
    /*
     Encapsulation
     creating one simple student data
     */

    private String firstName;
    private String lastName;
    private int  rollNo;
    private String address;

    /*public EncapsulationDemo(){

    }*/

    public String doSomeOperations(){

        System.out.println("Hey What is your name");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", address='" + address + '\'' +
                '}';
    }
}
