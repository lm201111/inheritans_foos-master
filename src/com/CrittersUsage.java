package com;

import com.critters.Animal;
import com.critters.Monkey;
import com.critters.Primate;

public class CrittersUsage {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        // Наполним обезьянку.
        monkey.setDiet(Monkey.Diet.herbivore);
        // Поля от предка Primate
        monkey.setNumberOfLimbs(5); // иногда хвост считается конечностью
        monkey.setHeightCM(110);
        monkey.setIq(75);
        monkey.setSex(Primate.Sex.male);
        // Поля  от предка Animal
        monkey.setAge(15);
        monkey.setAlive(true); // Оживили.

        // Доступны методы класса Object.toString()
        System.out.println(monkey.toString());

        printAnimalAge(monkey); // 15
        printAnimalAliveStatus(monkey); // true

        // Обратимся к полям, которые перекрыты в наследнике
        monkey.accessToHiddenMembers();

    }

// Оба метода будут работать с любыми наследниками класса Animal
    private static void printAnimalAge(Animal someAnimal) {
        System.out.println(someAnimal.getAge());
    }

    private static void printAnimalAliveStatus(Animal someAnimal) {
        System.out.println(someAnimal.isAlive());
    }
}
