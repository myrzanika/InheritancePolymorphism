package com.company.TopicStatic;
//Порядок выполнения
//статические отрабатывают на уровне классе
//НЕстатические отрабатывают на уровне объекта

// super()  - вызов конструктора или метода базового класса



public class A {
    {
        System.out.println("In block 1");
    }

    static{
        System.out.println("In static block 1");
    }
    A(){
        System.out.println("In constructor A");
    }

    {
        System.out.println("In block 2");
    }
    public static void main(String[] arg){
        A a = new A();
        A a2 = new A();
    }


}
