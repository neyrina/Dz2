package com.kukunina.dz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Running {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        List<Animal> Animals = new ArrayList<>();
        String inpWord = "";

        while (!inpWord.equals("exit")) {
            System.out.println("Меню");
            System.out.println("Введите add для выбора животного и ввода его параметров");
            System.out.println("Введите list для вывода всех элементов массива");
            System.out.println("Введите exit для выхода");
            inpWord = menu.next().trim().toLowerCase();

            Commands word = Commands.fetchValue(inpWord);
            if (word != null) {
                switch (word) {
                    case ADD:
                        Scanner inpType = new Scanner(System.in);
                        System.out.println("Введите вид животного (cat/dog/duck) ");
                        String type = inpType.next().trim().toLowerCase();
                        Scanner inpName = new Scanner(System.in);
                        System.out.println("Введите имя животного");
                        String name = inpName.next();
                        Scanner inpAge = new Scanner(System.in);
                        System.out.println("Введите возраст животного");
                        String age = inpAge.next();
                        Scanner inpWeight = new Scanner(System.in);
                        System.out.println("Введите вес животного");
                        String weight = inpWeight.next();
                        Scanner inpColor = new Scanner(System.in);
                        System.out.println("Введите цвет животного");
                        String color = inpColor.next();
                        switch (type) {
                            case "cat":
                                Animal cat = new Cat();
                                cat.setName(name);
                                cat.setAge(age);
                                cat.setWeight(weight);
                                cat.setColor(color);
                                Animals.add(cat);
                                cat.say();
                                break;
                            case "dog":
                                Animal dog = new Dog();
                                dog.setName(name);
                                dog.setAge(age);
                                dog.setWeight(weight);
                                dog.setColor(color);
                                Animals.add(dog);
                                dog.say();
                                break;
                            case "duck":
                                Animal duck = new Duck();
                                duck.setName(name);
                                duck.setAge(age);
                                duck.setWeight(weight);
                                duck.setColor(color);
                                Animals.add(duck);
                                duck.say();
                                break;
                            default:
                                System.out.println("Введено некорректное значение, введите заново");
                        }
                        break;
                    case LIST:
                        for (Animal animal : Animals) {
                            System.out.println(animal.toString());
                        }
                        System.out.println(" ");
                        break;
                    case EXIT:
                        System.out.println("Выход из меню");
                        break;
                    default:
                        System.out.println("Введено некорректное значение, введите заново");
                }

            } else {
                System.out.println("Incorrect input");
            }

        }
    }

}
