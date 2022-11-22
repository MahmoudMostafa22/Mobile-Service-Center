package com.example.themobile_servicecenter;
import java.util.Date;
public abstract class Person {

     private String name;
     private int Age;
     private int PhoneNumber;

    public Person() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Person(String name, int age, int phonenumber) {
        this.name = name;
        this.Age  = age;
        this.PhoneNumber = phonenumber;
    }


}
