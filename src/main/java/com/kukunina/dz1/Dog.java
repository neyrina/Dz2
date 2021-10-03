package com.kukunina.dz1;

public class Dog extends Animal{

    /*public Dog(String name, String age, String weight, String color) {
        Animal.name = name;
        Animal.age = age;
        Animal.weight = weight;
        Animal.color = color;
    }*/

    @Override
    public void say() {
        System.out.println("Я говорю Гав");
    }
}
