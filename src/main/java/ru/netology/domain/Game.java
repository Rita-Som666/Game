package ru.netology.domain;
import java.util.ArrayList;
import java.util.List;
public class Game {

    private boolean isRegister = false;
    private List<Player> players = new ArrayList<>();



    public void register(String name, int id, int strength) {
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setId(id);
        newPlayer.setStrength(strength);
        players.add(newPlayer);
        isRegister = true;
    }


    public List<Player> isRegistered(Player player) {

        if (isRegister == true) {
            players.add(player);
        }
        return players;
    }

    public int round (String playerName1, String playerName2) {
        NotRegisteredException exception = new NotRegisteredException
                ("Турнир невозможен из-за участия незарегистрированного игрока");
        if (isRegister == false) {
            throw exception;
        }
        Player player1 = new Player();
        player1.setName(playerName1);
        Player player2 = new Player();
        player2.setName(playerName2);
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player2.getStrength() > player1.getStrength()) {
            return 2;
        } else return 0;


    }





}
