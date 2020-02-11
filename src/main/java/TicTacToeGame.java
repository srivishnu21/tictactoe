import java.util.Arrays;
import java.util.Objects;

public class TicTacToeGame {

    private GameObject[][] gameMatrix;
    private GameObject gameObjectX;
    private GameObject getGameObjectO;

    public TicTacToeGame(GameObject gameObjectX, GameObject getGameObjectO) {
        this.gameObjectX = gameObjectX;
        this.getGameObjectO = getGameObjectO;
        gameMatrix = new GameObject[3][3];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacToeGame that = (TicTacToeGame) o;
        return Objects.equals(gameObjectX, that.gameObjectX) &&
                Objects.equals(getGameObjectO, that.getGameObjectO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameObjectX, getGameObjectO);
    }
}
