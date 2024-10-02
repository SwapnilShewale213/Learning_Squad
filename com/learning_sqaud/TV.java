package com.learning_sqaud;

public class TV {

   String name;
   public TV(String name){
       this.name = name;
   }
    public  void switchOn(){
        System.out.println("On............");
    }

    public  void display(String MHJ){
        System.out.println("Ohhh its visible");
        System.out.println(MHJ);
    }
}
class SmartTV extends  TV{

    public SmartTV(String name) {
        super(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Smart TV switchON.........");

    }

    @Override
    public void display(String n) {
        n = name;
        System.out.println("smart TV dispaly..........");
        System.out.println("this is from parent " + n);
    }


    public  void youtube(){
        System.out.println("Youtube is on.............");
    }

    public static void main(String[] args) {

        TV tv = new SmartTV("Rohit");
        tv.switchOn();
        tv.display("MHJ");
       // tv.youtube();

    }
}

//mobile
//laptop

/*
single
class A

class B extends A
 */
/*
Multilevel Inheritance

class A{  //super class / parent class

}
class B extends A{  // child class / subclass
}

class C extends B{ // base class

}

 */

/*
Hierarchical Inheritance
  class A

  class B extends A

  class C extends A

  class D  extends A
 */

