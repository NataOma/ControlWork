package model.impl;

import java.util.Calendar;

public class Donkey extends PackAnimals{

    private String comands = new String();

    public Donkey(String name, int id, Calendar birthday ) {
        this.typePackAnimals = "Осёл";
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
