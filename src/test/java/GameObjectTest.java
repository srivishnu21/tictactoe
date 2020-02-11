import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameObjectTest {

    @Test
    void shouldCheckTwoGameObjectsAreEqual() {
        GameObject gameObject = new GameObject('X');

        assertEquals(gameObject, new GameObject('X'));
    }
}