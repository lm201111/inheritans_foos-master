package com.critters;

public class Primate extends Animal {
    int numberOfLimbs;
    int heightCM;
    int iq;
    Sex sex;

    protected final String hiddenMember = "Primate's hidden first string.";
    private final String secondHiddenMember = "Primate's hidden second string.";

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public int getHeightCM() {
        return heightCM;
    }

    public void setHeightCM(int heightCM) {
        this.heightCM = heightCM;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public enum Sex { // Модуль 5. Урок 5. Перечисления в Java.
        male, female
    }
}
