package ru.netology.test;
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



    }
}

