// The package in which the current Java compilation unit is to be found.
package breaker.game.components.paddle.state;// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

/**
 * @author Andrei-Paul Ionescu
 */
public enum State {
    MOVING_LEFT(-1), IDLE(0), MOVING_RIGHT(1);

    State(int i) {}
}
