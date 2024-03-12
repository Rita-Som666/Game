package ru.netology.domain;

public class Player {
   private int id;
    private String name;
    private int strength;

    public void setName(String name){this.name = name;}
    public void setId (int id){this.id = id;}
    public void setStrength(int strength){this.strength = strength;}
    public int getId(){return id;}
    public int getStrength(){return strength;}
    public String getName(){return name;}


}
