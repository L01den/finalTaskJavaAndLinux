package org.example;

public abstract class Aminal {
    int id;
    String name;

    public Aminal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aminal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
