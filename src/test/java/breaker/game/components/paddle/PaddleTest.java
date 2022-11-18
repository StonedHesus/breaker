// The package in which the current Java compilation unit is to be found.
package breaker.game.components.paddle;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import javafx.scene.input.KeyCode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andrei-Paul Ionescu
 */
public class PaddleTest {

    // Fields/attributes of the class.
    private static Paddle paddle;

    @BeforeAll
    public static void init(){
        PaddleTest.paddle = new Paddle();
    }

    @BeforeEach
    public void before(){
        PaddleTest.paddle.reset();
    }

    @Test
    @DisplayName("Test to see whether the move function behaves properly when it receives the keycode for moving west.")
    public void testMovingWest(){
        PaddleTest.paddle.move(KeyCode.A);
        PaddleTest.paddle.move(KeyCode.A);

        assertEquals(-(Paddle.getSPEED() * 2), PaddleTest.paddle.getDeltaX());
    }

    @Test
    @DisplayName("Test to see whether the move function behaves properly when it receives the keycode for moving east.")
    public void testMovingEast(){
        PaddleTest.paddle.move(KeyCode.D);
        PaddleTest.paddle.move(KeyCode.D);

        assertEquals(Paddle.getSPEED() * 2, PaddleTest.paddle.getDeltaX());
    }
}
