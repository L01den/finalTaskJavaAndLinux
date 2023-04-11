package org.example;

import org.example.baggage.Camel;
import org.example.baggage.Donkey;
import org.example.baggage.Horse;
import org.example.domestic.Cat;
import org.example.domestic.Dog;
import org.example.domestic.Hamster;

import java.util.ArrayList;
import java.util.List;

public class AnimalRelay {
    private int ID = 0;
    private static List<Animal> animals = new ArrayList<>();

    public AnimalRelay() {

    }

    public void initAnimal() {
        animals.add(new Dog(++ID, "Агамма"));
        animals.add(new Cat(++ID, "Чуча"));
        animals.add(new Dog(++ID, "Мультик"));
    }

    public void create(int codeAnimal, String name) {
        Animal animal = null;
        switch (codeAnimal) {
            case 1:
                animal = new Dog(++ID, name);
                break;
            case 2:
                animal = new Cat(++ID, name);
                break;
            case 3:
                animal = new Hamster(++ID, name);
                break;
            case 4:
                animal = new Horse(++ID, name);
                break;
            case 5:
                animal = new Camel(++ID, name);
                break;
            case 6:
                animal = new Donkey(++ID, name);
                break;
        }

        add(animal);
        System.out.println(name + " - животное добавлено)");
    }

    private void add(Animal animal) {
        animals.add(animal);
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            String[] nameClass = String.valueOf(animal.getClass()).split("\\.");
            System.out.println(nameClass[nameClass.length - 1] + " " + animal);
        }
    }

    public void getCommands(int id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                for (String conammd : animal.getComands()) {
                    System.out.printf(conammd + ", ");
                }
            }
            System.out.println();
        }
    }

    public void addCommand(int id, String command) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                animal.getComands().add(command);
            }
        }
    }

}
