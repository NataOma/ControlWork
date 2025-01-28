package model.impl;

import java.util.Calendar;

public class Hamster extends Pets{

    private String comands = new String();

    public Hamster(String name, int id, Calendar birthday ) {
        this.typePet = "Кот";
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
