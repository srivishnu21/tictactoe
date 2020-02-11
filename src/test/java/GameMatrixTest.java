import org.junit.jupiter.api.Test;

import javax.management.InstanceAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.*;

class GameMatrixTest {

    @Test
    void shouldCheckIfTicTacToeGameIsInitializedCorrectly() {
        GameMatrix gameMatrix = new GameMatrix(new GameObject('X'), new GameObject('O'));

        assertEquals(gameMatrix, new GameMatrix(new GameObject('X'), new GameObject('O')));
    }

    @Test
    void shouldAbleToPutAGameObjectInsideGameMatrix() throws InstanceAlreadyExistsException, ArrayIndexOutOfBoundsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        GameMatrix gameMatrix = new GameMatrix(gameObjectX, gameObjectO);

        gameMatrix.putValue(0, 0, gameObjectX);
    }

    @Test
    void shouldThrowExceptionWhenUserTriesToPutGameObjectInAlreadyFilledPlace() throws InstanceAlreadyExistsException, ArrayIndexOutOfBoundsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        GameMatrix gameMatrix = new GameMatrix(gameObjectX, gameObjectO);

        gameMatrix.putValue(0, 0, gameObjectX);
        assertThrows(InstanceAlreadyExistsException.class, () -> gameMatrix.putValue(0, 0, gameObjectX));
    }

    @Test
    void shouldThrowExceptionWhenRowOrColumnInputExceedsTwo() throws InstanceAlreadyExistsException, ArrayIndexOutOfBoundsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        GameMatrix gameMatrix = new GameMatrix(gameObjectX, gameObjectO);

        gameMatrix.putValue(0, 0, gameObjectX);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> gameMatrix.putValue(3, 0, gameObjectX));
    }

    @Test
    void shouldReturnTrueForAStrikeWhenXStrikesInARow() throws InstanceAlreadyExistsException, ArrayIndexOutOfBoundsException {
        GameObject gameObjectX = new GameObject('X');
        GameObject gameObjectO = new GameObject('O');
        GameMatrix gameMatrix = new GameMatrix(gameObjectX, gameObjectO);

        gameMatrix.putValue(0, 0, gameObjectX);
        gameMatrix.putValue(0, 1, gameObjectX);
        gameMatrix.putValue(0, 2, gameObjectX);

        assertTrue(gameMatrix.checkForAStrike(0, 2, gameObjectX));
    }
}