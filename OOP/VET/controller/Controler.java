package controller;

import java.util.Calendar;

import service.Service;

public class Controler {

    Service s = new Service();

    public void addCat(String name, Calendar birthday){
        s.addCat(name, birthday);
    }
    public void addDog(String name, Calendar birthday){
        s.addDog(name, birthday);
    }
    public void addHamster(String name, Calendar birthday){
        s.addHamster(name, birthday);
    }
    public void addHourse(String name, Calendar birthday){
        s.addHourse(name, birthday);
    }
    public void addCamel(String name, Calendar birthday){
        s.addCamel(name, birthday);
    }
    public void addDonkey(String name, Calendar birthday){
        s.addDonkey(name, birthday);
    }

    public boolean toTerminalAnimals(){
        return s.toTerminalAnimals();
    }

    public boolean toTerminalAnimalsBirthday(){
        return s.toTerminalAnimalsBirthday();
    }

    public void getComands(int id){
        s.getComands(id);
    }

    public void lernComand(int id, String comandName){
        s.lernComand(id, comandName);
    }

    public void setCount(){
        System.out.println("Кол-во животных: " + s.setCount());
    }
}
