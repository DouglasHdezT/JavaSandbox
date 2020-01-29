package com.deushdezt;

import com.deushdezt.contexts.InputStrategyContext;
import com.deushdezt.models.Person;

public class Main {

    public static void main(String[] args) {
        InputStrategyContext input = new InputStrategyContext("GUI");

        Person person = input.getNewPerson();
        System.out.println(person.toString());

        input = new InputStrategyContext("CLI");

        person = input.getNewPerson();
        System.out.println(person.toString());
    }
}
