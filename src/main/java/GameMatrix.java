import javax.management.InstanceAlreadyExistsException;
import java.util.Objects;

public class GameMatrix {

    private GameObject[][] gameMatrix;
    private GameObject gameObjectX;
    private GameObject gameObjectO;
    private int matrixSize = 2;

    public GameMatrix(GameObject gameObjectX, GameObject gameObjectO) {
        this.gameObjectX = gameObjectX;
        this.gameObjectO = gameObjectO;
        gameMatrix = new GameObject[3][3];
    }

    public void putValue(int row, int column, GameObject gameObjectToPut) throws InstanceAlreadyExistsException, ArrayIndexOutOfBoundsException {
        if (row > matrixSize && column > matrixSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (gameMatrix[row][column] != null) {
            throw new InstanceAlreadyExistsException();
        }
        gameMatrix[row][column] = gameObjectToPut;
    }

    public boolean checkForAStrike(int row, int column, GameObject gameObjectToCheck) {
        if (checkStrikeInARow(row, gameObjectToCheck)) {
            return true;
        }
        return false;
    }

    private boolean checkStrikeInARow(int row, GameObject gameObjectToCheck) {
        for (int index = 0; index <= matrixSize; index++) {
            if (!gameMatrix[row][index].equals(gameObjectToCheck)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMatrix that = (GameMatrix) o;
        return Objects.equals(gameObjectX, that.gameObjectX) &&
                Objects.equals(gameObjectO, that.gameObjectO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameObjectX, gameObjectO);
    }

}
