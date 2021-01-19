package com.ironhack.exercise1_3_4.main;

import com.ironhack.exercise1_3_4.classes.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person persona1 = new Person(3452343,"Juan", 30, "Jardinero");

        persona1.setAge(30);
        System.out.println(persona1.getAge());

        persona1.writePersonInformation(persona1);
        persona1.writePersonInformation(persona1);






    }


}
