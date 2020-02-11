import org.junit.jupiter.api.Test;

import javax.management.InstanceAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicTacToeGameTest {

    @Test
    void shouldCheckIfTicTacToeGameIsInitializedCorrectly() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame(new GameObject('X'), new GameObject('O'));

        assertEquals(ticTacToeGame, new TicTacToeGame(new GameObject('X'), new GameObject('O')));
    }

    @Test
    void shouldAbleToPutAGameObjectInsideGameMatrix() throws InstanceAlreadyExistsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        TicTacToeGame ticTacToeGame = new TicTacToeGame(gameObjectX, gameObjectO);

        ticTacToeGame.putValue(0, 0, gameObjectX);
    }

    @Test
    void shouldThrowExceptionWhenUserTriesToPutGameObjectInAlreadyFilledPlace() throws InstanceAlreadyExistsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        TicTacToeGame ticTacToeGame = new TicTacToeGame(gameObjectX, gameObjectO);

        ticTacToeGame.putValue(0, 0, gameObjectX);
        assertThrows(InstanceAlreadyExistsException.class, () -> ticTacToeGame.putValue(0, 0, gameObjectX));
    }
}