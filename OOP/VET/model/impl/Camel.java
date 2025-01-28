package model.impl;

import java.util.Calendar;

public class Camel extends PackAnimals{

    private static String comands = new String();

    public Camel(String name, int id, Calendar birthday ) {
        this.typePackAnimals = "Верлюд";
        this.name = name;
        this.birthday = birthday;
        this.id = id;
        }

    public String getComands(){
        return comands;
    }

    public void lernComand(String comandName) {
        comands = comands.concat("; " + comandName);
    }
}
