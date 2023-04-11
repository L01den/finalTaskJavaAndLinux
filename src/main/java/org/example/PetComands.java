package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetComands {
    private List<Comand> comands = new ArrayList<>();

    public void initComand(){
        Comand[] commandEnam = Comand.values();
        comands = Arrays.asList(commandEnam);
        // TO DO
    }
}
