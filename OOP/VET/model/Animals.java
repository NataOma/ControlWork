package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;

public abstract class Animals {
    protected int id;
    protected String name;
    protected Calendar birthday;

    public int getId() {
        return id;
    }

    public String toString() {
        return id + ") " + name + ", " + format.format(birthday.getTime());
    }

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public Calendar getBirthday() {
        return birthday;
    }

    public abstract String getComands();

    public abstract void lernComand(String comandName);

    public static Comparator<Animals> idComparator = new Comparator<Animals>(){
        public int compare(Animals a1, Animals a2){
            return Integer.compare(a1.getId(), a2.getId());
        }
    };

    public static Comparator<Animals> birthdayComparator = new Comparator<Animals>() {
        public int compare(Animals a1, Animals a2){
            return a1.getBirthday().compareTo(a2.getBirthday());
        }
    };

}



