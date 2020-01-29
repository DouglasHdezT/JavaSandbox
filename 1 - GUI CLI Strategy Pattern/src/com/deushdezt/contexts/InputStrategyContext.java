package com.deushdezt.contexts;

import com.deushdezt.models.Person;
import com.deushdezt.strategies.CLIStrategy;
import com.deushdezt.strategies.GUIStrategy;
import com.deushdezt.strategies.InputStrategy;

public class InputStrategyContext {
    private InputStrategy strategy;

    public InputStrategyContext(String type) {
        if(type != null && type.equals("GUI")){
            strategy = new GUIStrategy();
        }else {
            strategy = new CLIStrategy();
        }
    }

    public Person getNewPerson(){
        return strategy.getPerson();
    }
}
