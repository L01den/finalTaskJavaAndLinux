package org.example;

import org.example.domestic.Dog;

import java.util.Scanner;

public class Main {
    public static AnimalRelay animalRelay = new AnimalRelay();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        animalRelay.initAnimal();
        while (true) {
            System.out.println("Выберите действие:" +
                    "\n1 - Добавить животное" +
                    "\n2 - Посмотреть команды животного" +
                    "\n3 - Вывести всех животных" +
                    "\n4 - Обучить животное" +
                    "\n5 - Выход");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    getCommands();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    addCommand();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Я не знаю такой команды!");
                    System.out.println();
            }
        }
    }

    private static void addAnimal() {
        System.out.println("Выберите вид животного, который хотите добавить" +
                "\n1 - Собака" +
                "\n2 - Кошка" +
                "\n3 - Хомячок" +
                "\n4 - Лошадь" +
                "\n5 - Верблюд" +
                "\n6 - Осёл");
        int codeAnimal = scanner.nextInt();
        System.out.println("Введите имя животного");
        String nameAnimal = scanner.next();
        animalRelay.create(codeAnimal, nameAnimal);

    }
    private static void print() {
        animalRelay.printAnimals();
    }

    private static void getCommands(){
        animalRelay.printAnimals();
        System.out.println("Выдерите id животного, у которого хотите посмотреть команды");
        int id = scanner.nextInt();
        animalRelay.getCommands(id);
    }
    private static void addCommand(){
        animalRelay.printAnimals();
        System.out.println("Выдерите id животного, которого хотите обучить");
        int id = scanner.nextInt();
        System.out.println("Выдерите новую команду");
        String newCommand = scanner.next();
        animalRelay.addCommand(id, newCommand);

    }
}