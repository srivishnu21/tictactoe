import javax.management.InstanceAlreadyExistsException;
import java.util.Objects;

public class TicTacToeGame {

    private GameObject[][] gameMatrix;
    private GameObject gameObjectX;
    private GameObject gameObjectO;

    public TicTacToeGame(GameObject gameObjectX, GameObject gameObjectO) {
        this.gameObjectX = gameObjectX;
        this.gameObjectO = gameObjectO;
        gameMatrix = new GameObject[3][3];
    }

    public void putValue(int row, int column, GameObject gameObjectToPut) throws InstanceAlreadyExistsException {
        if (gameMatrix[row][column] != null) {
            throw new InstanceAlreadyExistsException();
        }
        gameMatrix[row][column] = gameObjectToPut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacToeGame that = (TicTacToeGame) o;
        return Objects.equals(gameObjectX, that.gameObjectX) &&
                Objects.equals(gameObjectO, that.gameObjectO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameObjectX, gameObjectO);
    }

}
