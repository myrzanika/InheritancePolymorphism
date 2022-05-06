package com.company;
//НАСЛЕДОВАНИЕ И ПОЛИМОРФИЗМ
//
//Базовый класс - Производный класс
public class Main {

    public static void main(String[] args) {

        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        System.out.println(instance.protectedField);

        System.out.println(instance.getPrivateField());
    }
}
