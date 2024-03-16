package ru.netology.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Game {


    // public List<Player> players = new ArrayList<>();
    public HashMap<String, Player> players = new HashMap<>();


    public void register(String name, Player player) {
        player.setIsRegister(true);
        players.put(name, player);
    }


    public int round(String playerName1, String playerName2) {


        NotRegisteredException exception = new NotRegisteredException
                ("Турнир невозможен из-за участия незарегистрированного игрока");
        Player player1 = players.get(playerName1);
        Player player2 = players.get(playerName2);

        if (player1 == null) {
            throw exception;
        }
        if (player2 == null) {
            throw exception;
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player2.getStrength() > player1.getStrength()) {
            return 2;
        } else return 0;


    }

    public String getInfoByName(String name) {
        Player player = players.get(name);
        String s = "Ничего не найдено";
        if (player != null) {
            return player.getPlayerInfo();

        } else {
            return s;
        }
    }


}
