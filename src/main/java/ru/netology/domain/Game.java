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
        for (Player player : players) {
            if (player.getName() == playerName1 && player.getName() == playerName2) {
                Player player1 = new Player();
                player1.setName(playerName1);
                Player player2 = new Player();
                player2.setName(playerName2);
                if (player1.getStrength() > player2.getStrength()) {
                    return 1;
                }
                if (player2.getStrength() > player1.getStrength()) {
                    return 2;
                } else {
                    return 0;
                }

            } else throw exception;

        }

    }
    public String getInfoByName(String name){
        for (Player player : players){
            if (name == player.getName()){
                return player.getPlayerInfo();
            }
        } return null;

    }

}
