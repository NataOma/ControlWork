package model.DB;

import java.util.ArrayList;
import java.util.Collections;

import model.Animals;
import model.impl.PackAnimals;
import model.impl.Pets;

public class DB {

    private ArrayList<Animals> AnimalsDB = new ArrayList<>();

    public int getID(){
        return AnimalsDB.size() + 1 ;
    }

    // ArrayList<Pets> PetsDB = new ArrayList<Pets>();
    // ArrayList<PackAnimals> PackAnimalsDB = new ArrayList<PackAnimals>();

    // public int getID(){
    //     return PetsDB.size() + PackAnimalsDB.size() + 1 ;
    // }

    public void setPackAnimals(PackAnimals p){
        AnimalsDB.add(p);
    }

    public void setPets(Pets p){
        AnimalsDB.add(p);
    }

    public void toTerminalAnimals(){
        Collections.sort(AnimalsDB, Animals.idComparator);
        System.out.println(AnimalsDB);
    }

    public void toTerminalAnimalsBirthday(){
        Collections.sort(AnimalsDB, Animals.birthdayComparator);
        System.out.println(AnimalsDB);
    }

    public Animals getAnimals(int id){
        Collections.sort(AnimalsDB, Animals.idComparator);
        return AnimalsDB.get(id - 1);
    }

    public void returnAnimals(Animals a){
        AnimalsDB.set(a.getId() - 1, a);
    }

}
