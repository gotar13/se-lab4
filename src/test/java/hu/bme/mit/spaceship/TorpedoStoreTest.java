package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void count_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(13);

        // Assert
        assertEquals(13, store.getTorpedoCount());
    }

    @Test
    void store_empty_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(true, result);
    }

    @Test
    void store_not_empty_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(5);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(false, result);
    }

    @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1, 1.0);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(false, result);
    }
}
