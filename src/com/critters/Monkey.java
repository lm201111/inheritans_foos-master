package com.critters;

public class Monkey extends Primate {
    Diet diet;

    protected final String hiddenMember = "Monkeys's hidden string.";

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public enum Diet { // Модуль 5. Урок 5. Перечисления в Java.
        omnivorous, carnivore, herbivore
    }

    public void accessToHiddenMembers() {
        System.out.println(hiddenMember);
        System.out.println(super.hiddenMember);

//        System.out.println(super.secondHiddenMember); // private member

//        System.out.println(super.super.hiddenMember); // Так тоже нельзя.
    }
}
