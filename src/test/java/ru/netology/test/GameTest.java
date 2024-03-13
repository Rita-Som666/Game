package ru.netology.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Game;
import ru.netology.domain.Player;

import java.util.List;


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
            "Паша",
            5
    );

    Game game = new Game();

    @Test
    public void shouldRegister(){
        game.register(player1);
        Assertions.assertTrue(player1.getIsRegister());



    }

    @Test
    public void shouldAddInList(){
        game.register(player1);
        game.register(player2);
        game.register(player3);

        List<Player> expected = List.of(player1, player2, player3);
        List<Player> actual = game.players;
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void shouldRoundAndReturn1(){
        game.register(player1);
        game.register(player2);
        int actual = game.round("Арина", "Иван");
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }
}

