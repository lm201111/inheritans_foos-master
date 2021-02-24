package com.critters;
public class Animal {
    boolean isAlive;
    int age;

    protected final String hiddenMember = "Animal's hidden string.";

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
