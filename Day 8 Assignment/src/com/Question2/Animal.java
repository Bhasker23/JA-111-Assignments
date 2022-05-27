package com.Question2;


//Class cast Exception -> If you extend any child class from another child class and in main method you downcast 
//the first child class with new child class, it will not give you any error in IDE but while compiling it;s gives you a
// class cast exception it is also known as runtime exception.

class Animal {
    public void eat() {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat() {
        System.out.println("Goat exdents Animal");
    }
}

class Sheep extends Goat{
  public void eat() {
        System.out.println("sheep extentds Goat");
  }

}
