package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Game;
import ru.netology.domain.NotRegisteredException;
import ru.netology.domain.Player;

import java.io.NotActiveException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GameTest {

    Player player1 = new Player(
            1,
            "Иван",
            20
    );
    Player player2 = new Player(
            22,
            "Арина",
            320

    );


    Player player3 = new Player(
            333,
            "Юля",
            320
    );

    Game game = new Game();

    @Test
    public void shouldRegister() {
        game.register("Иван", player1);
        Assertions.assertTrue(player1.getIsRegister());


    }

    @Test
    public void shouldAddInList() {
        game.register("Иван", player1);
        game.register("Арина", player2);
        game.register("Юля", player3);

        HashMap<String, Player> expected = new HashMap<>();
        expected.put("Иван", player1);
        expected.put("Арина", player2);
        expected.put("Юля", player3);
        HashMap<String, Player> actual = game.players;
        ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRoundAndReturn1() {
        game.register("Иван", player1);
        game.register("Арина", player2);
        int actual = game.round("Арина", "Иван");
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRoundAndReturn2() {
        game.register("Иван", player1);
        game.register("Арина", player2);
        int actual = game.round("Иван", "Арина");
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRoundAndReturn0() {
        game.register("Арина", player2);
        game.register("Юля", player3);
        int actual = game.round("Арина", "Юля");
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTrowIfTwoPlayersNotRegister() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Арина", "Иван");
        });

    }

    @Test
    public void shouldTrowIfPlayer1NotRegister() {
        game.register("Арина", player2);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Арина", "Иван");
        });
    }

    @Test
    public void shouldTrowIfPlayer2NotRegister() {
        game.register("Иван", player1);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Арина", "Иван");
        });
    }

    @Test
    public void shouldReturnEmptyList() {
        HashMap<String, Player> expected = new HashMap<>();
        HashMap<String, Player> actual = game.players;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldGetInfo() {
        game.register("Иван", player1);
        String actual = game.getInfoByName("Иван");
        String expected = "ID: " + player1.getId() + ", Имя: " + player1.getName() + ", Сила: " + player1.getStrength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNothingNotSearch() {
        String expected = "Ничего не найдено";
        String actual = game.getInfoByName("Иван");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNothingNotSearch2() {
        game.register("Иван", player1);
        String expected = "Ничего не найдено";
        String actual = game.getInfoByName("Арина");
        Assertions.assertEquals(expected, actual);
    }


}

