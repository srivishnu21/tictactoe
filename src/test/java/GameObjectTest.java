import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameObjectTest {

    @Test
    void shouldCheckTwoGameObjectsAreEqual() {
        GameObject gameObject = new GameObject('X');

        assertEquals(gameObject, new GameObject('X'));
    }

    @Test
    void shouldCheckIfTwoGameObjectsAreNotEqual() {
        GameObject gameObject = new GameObject('O');

        assertEquals(gameObject, new GameObject('O'));
    }
}