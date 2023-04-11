package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Animal {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private List<String> comands = new ArrayList<>(); // ???
    private PetComands comand;



    public Animal(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Collections.addAll(comands, "GO", "STOP", "RUN_AWAY", "COME_UP", "LIE", "JUMP", "STAND_UP");
    }

    @Override
    public String toString() {
        return "Name - " + name + ", id - " + id;
    }

    public List<String> getComands() {
        return comands;
    }

    public int getId() {
        return id;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
}


//+ animal(int, datetime)
//        + setDateOfBirth(datetime): void
//        + getDateOfBirth(): datetime
//        + setName(String): void
//        + getName(): String
//        + addCommand(enum): void