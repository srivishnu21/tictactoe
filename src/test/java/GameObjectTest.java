import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GameObjectTest {

    @Test
    void shouldCheckTwoGameObjectsAreEqualForX() {
        GameObject gameObject = new GameObject('X');

        assertEquals(gameObject, new GameObject('X'));
    }

    @Test
    void shouldCheckTwoGameObjectsAreEqualForO() {
        GameObject gameObject = new GameObject('O');

        assertEquals(gameObject, new GameObject('O'));
    }

    @Test
    void shouldCheckIfTwoGameObjectsAreNotEqual() {
        GameObject gameObject = new GameObject('O');

        assertNotEquals(gameObject, new GameObject('X'));
    }
}