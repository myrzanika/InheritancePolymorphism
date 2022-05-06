package com.company;

public class BaseClass {

    //дефолтный доступ к переменной. В рамках пакета
    int a = 1;

    //Открытый доступ к переменной
    public String publicField = "BaseClass.publicField";

    //Закрытый доступ к переменной. В рамках класса
    private String privateField = "BaseClass.privateField";

    //Защищенный доступ к переменной. В рамках пакета или в классах наследниках
    protected String protectedField = "BaseClass.protectedField";

    //Через метод public, можно получить закрытую переменную private
    public String getPrivateField() {
        return privateField;
    }
}
