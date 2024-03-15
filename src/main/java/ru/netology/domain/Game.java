package ru.netology.domain;

import java.util.ArrayList;
import java.util.List;


public class Game {


    public List<Player> players = new ArrayList<>();


    public void register(Player player) {
        player.setIsRegister(true);
        players.add(player);
    }


    public int round(String playerName1, String playerName2) {


        NotRegisteredException exception = new NotRegisteredException
                ("Турнир невозможен из-за участия незарегистрированного игрока");
        Player player1 = null;
        Player player2 = null;
        for (Player player : players) {
            if (player.getName() == playerName1) {
                player1 = player;
            }
            if (player.getName() == playerName2) {
                player2 = player;
            }

        }
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
        String s = "Ничего не найдено";
        for (Player player : players) {
            if (name == player.getName()) {
                return player.getPlayerInfo();

            }
        }
        return s;


    }
}