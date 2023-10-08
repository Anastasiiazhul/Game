package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void testWhenFirstPlayerWin() {
        Player vasya = new Player(1, "Вася", 100);
        Player petya = new Player(2, "Петя", 120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);
        int actual = game.round("Петя","Вася");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFirstPlayerNotExist() {
        Player vasya = new Player(1, "Вася", 100);
        Player petya = new Player(2, "Петя", 120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);
        Assertions.assertThrows(NotRegistredException.class,
                () -> game.round ("Жора", "Вася")
        );
    }
}