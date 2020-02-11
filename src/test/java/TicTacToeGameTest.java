import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToeGameTest {

    @Test
    void shouldCheckIfTicTacToeGameIsInitializedCorrectly() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame(new GameObject('X'), new GameObject('O'));

        assertEquals(ticTacToeGame, new TicTacToeGame(new GameObject('X'), new GameObject('O')));
    }
}