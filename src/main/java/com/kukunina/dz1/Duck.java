package com.kukunina.dz1;

public class Duck extends Animal implements Flying{

    /*public Duck(String name, String age, String weight, String color) {
        Animal.name = name;
        Animal.age = age;
        Animal.weight = weight;
        Animal.color = color;
    }*/

    public void fly() {
        System.out.println(" Я лечу");
    }

    @Override
    public void say() {
        System.out.println("Я говорю Кря");
    }


}
