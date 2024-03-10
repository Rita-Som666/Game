package ru.netology.domain;
import java.util.ArrayList;
import java.util.List;
public class Game {

    private boolean isRegister = false;



    public void register(String name, int id) {
        Player player = new Player();
        player.setName(name);
        player.setId(id);
        isRegister = true;
    }


    public List<Player> isRegistered(Player player) {
        List<Player> players = new ArrayList<>();
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
        if (player1.strength > player2.strength) {
            return 1;
        }
        if (player2.strength > player1.strength) {
            return 2;
        } else return 0;


    }

    public



}
