package ru.sapteh;

public class Person {
    private String name;
    private int age;
    private int date;

    public Person(){}
    public Person(String name, int age, int date){
        this.name = name;
        this.age = age;
        this.date = date;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Date: " + getDate();
    }
}