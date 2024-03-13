package ru.netology.domain;

public class Player {
    private int id;

    public int getId(){return id;}
    public void setId (int id){this.id = id;}
    private String name;
    private int strength;

    private boolean isRegister = false;

    public void setIsRegister(boolean isRegister){this.isRegister = isRegister;}
    public boolean getIsRegister(){return isRegister;}



    public void setName(String name){this.name = name;}

    public void setStrength(int strength){this.strength = strength;}

    public int getStrength(){return strength;}
    public String getName(){return name;}

    public String getPlayerInfo(){return "ID: " + id + ", Имя: " + name + ", Сила: " + strength;}

    public Player(int id, String name, int strength){
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
    public Player(){}
}