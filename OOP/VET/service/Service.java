package service;

import java.util.Calendar;

import model.Animals;
import model.DB.DB;
import model.impl.Camel;
import model.impl.Cat;
import model.impl.Dog;
import model.impl.Donkey;
import model.impl.Hamster;
import model.impl.Hourse;

public class Service {

    DB db = new DB();

    public void addCat(String name, Calendar birthday){
        Cat c = new Cat(name, db.getID(), birthday);
        db.setPets(c);
    }
    public void addDog(String name, Calendar birthday){
        Dog c = new Dog(name, db.getID(), birthday);
        db.setPets(c);
    }
    public void addHamster(String name, Calendar birthday){
        Hamster c = new Hamster(name, db.getID(), birthday);
        db.setPets(c);
    }
    public void addHourse(String name, Calendar birthday){
        Hourse c = new Hourse(name, db.getID(), birthday);
        db.setPackAnimals(c);
    }
    public void addCamel(String name, Calendar birthday){
        Camel c = new Camel(name, db.getID(), birthday);
        db.setPackAnimals(c);
    }
    public void addDonkey(String name, Calendar birthday){
        Donkey c = new Donkey(name, db.getID(), birthday);
        db.setPackAnimals(c);
    }

    public boolean toTerminalAnimals(){
        if (db.getID() == 1) {
            return false;
        }else{
            db.toTerminalAnimals();
        }
        return true;
    }

    public boolean toTerminalAnimalsBirthday(){
        if (db.getID() == 1) {
            return false;
        }else{
            db.toTerminalAnimalsBirthday();
        }
        return true;
    }

    public void getComands(int id){
        if (db.getAnimals(id).getComands().equals("")) {
            System.out.println("команды не изучены");
        }else{
            System.out.println("Изученные команды: " + db.getAnimals(id).getComands());
        }
    }
    
    public void lernComand(int id, String comandName){
        try {
            Animals a = db.getAnimals(id);
            a.lernComand(comandName);
            db.returnAnimals(a);
        } catch (Exception e) {
            System.out.println("Соманда не выполнена, ID не найден");
        }
    }

    public int setCount(){
        return db.getID() - 1;
    }

}
