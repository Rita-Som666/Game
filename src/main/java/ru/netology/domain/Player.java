package ru.netology.domain;

public class Player {
    private int id;

    public int getId() {
        return id;
    }

    private String name;
    private int strength;

    private boolean isRegister = false;

    public void setIsRegister(boolean isRegister) {
        this.isRegister = isRegister;
    }

    public boolean getIsRegister() {
        return isRegister;
    }


    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public String getPlayerInfo() {
        return "ID: " + id + ", Имя: " + name + ", Сила: " + strength;
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

}