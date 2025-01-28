package view;

import java.util.GregorianCalendar;
import java.util.Scanner;

import controller.Controler;
import controller.ParseController;

public class View {

    static Controler c = new Controler();
    static ParseController p = new ParseController();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {

        boolean shouldExit = false;

 

        while (!shouldExit) {

            displayMenu();

            int choice = -1;

            try {
                choice = p.StringToInt(scanner.next());
                scanner.nextLine();
            } catch (Exception e) {
                
            }
            
            
            

            switch (choice) {

                case 1:

                    addAnimal();

                    break;

                case 2:

                    displayAnimalCommands();

                    break;

                case 3:

                    learnNewCommand();

                    break;

                case 4:

                    toTerminalAnimalsBirthday();

                    break;

                case 5:

                    c.setCount();

                    break;

                case 6:

                    System.out.println("Выход из программы.");

                    scanner.close();

                    shouldExit = true;

                    break;

                default:

                    System.out.println("Неверный выбор. Попробуйте еще раз.");

            }

        }

    }

    private static void displayMenu() {

        System.out.println("\nМеню реестра домашних животных:");

        System.out.println("1. Добавить новое животное");

        System.out.println("2. Вывести список команд животного");

        System.out.println("3. Обучить животное новой команде");

        System.out.println("4. Вывести список животных по дате рождения");

        System.out.println("5. Вывести колличество животных в реестре");

        System.out.println("6. Выход");

        System.out.print("Введите номер операции: ");

    }

    private static void addAnimal() {
        
        System.out.println("Введите данные о животном в Формате:\nтип имя день месяц год");
        System.out.println("Типы животных:");
        System.out.println("1) Кот");
        System.out.println("2) Собака");
        System.out.println("3) Хомяк");
        System.out.println("4) Лошадь");
        System.out.println("5) Верблюд");
        System.out.println("6) Верблюд");

        String[] arr = scanner.nextLine().split(" ");
        try {
            if(arr.length == 5){
                switch (p.StringToInt(arr[0])) {
                    case 1:
                        try {
                            c.addCat(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
                        break;
        
                    case 2:
                        try {
                            c.addDog(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
                        break;
        
                    case 3:
                        try {
                            c.addHamster(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
                        break;
        
                    case 4:
                        try {
                            c.addHourse(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
                        break;
        
                    case 5:
                        try {
                            c.addCamel(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
        
                        break;
        
                    case 6:
                        try {
                            c.addDonkey(arr[1],
                                    new GregorianCalendar(p.StringToInt(arr[4]), p.StringToInt(arr[3]), p.StringToInt(arr[2])));
                        } catch (Exception e) {
                            System.out.println("Неверно указана дата");
                        }
                        break;
        
                    default:
        
                        System.out.println("Неизвестный тип животного");
        
                        break;
                }
            }else{
                System.out.println("Не верный формат данных");
            }
        } catch (Exception e) {
            System.out.println("Не верный формат данных");
        }
        
        
    }

    private static void displayAnimalCommands(){

        if (c.toTerminalAnimals()) {
            System.out.println("Выберите животное: ");

        try {
            int id = p.StringToInt(scanner.next());
            scanner.nextLine();
            c.getComands(id);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            e.printStackTrace();
        }
        }else{
            System.out.println("База пуста");
        }
        

        
            
        
    }

    private static void learnNewCommand() {

        c.toTerminalAnimals();

        if (c.toTerminalAnimals()) {
            System.out.println("Введите Id и команду через пробел: ");

            String[] arr = scanner.nextLine().split(" ");
            try {
                if (arr.length == 2 && p.HasInt(arr[0])) {
                    c.lernComand(p.StringToInt(arr[0]), arr[1]);
                } else {
                    System.out.println("Ошибка ввода данных");
                }
            } catch (Exception e) {
            }
        } else {
            System.out.println("База пуста");
        }
        

    }

    private static void toTerminalAnimalsBirthday(){
        if (c.toTerminalAnimalsBirthday()) {
            
        }else{
            System.out.println("База пуста");
        }
        
    }
}