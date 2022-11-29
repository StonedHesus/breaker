// The package in which the current Java compilation unit is to be found.
package breaker.game.settings;// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import javafx.scene.paint.Color;

/**
 * @author Andrei-Paul Ionescu
 */
public interface Settings {

    // Settings which concern the paddle object.
    Color DEFAULT_PADDLE_COLOUR = Color.DARKGRAY;
    double DEFAULT_PADDLE_WIDTH = 135;
    double DEFAULT_PADDLE_HEIGHT = 25;
    double DEFAULT_ARC_WIDTH = 30;
    double DEFAULT_ARC_HEIGHT = 20;

    // Settings concerning the ball game object.
    double DEFAULT_BALL_RADIUS = 15;
    Color DEFAULT_BALL_COLOUR = Color.DARKGOLDENROD;

    // Settings which concern the game window.
    double DEFAULT_GAME_WINDOW_WIDTH = 1280;
    double DEFAULT_GAME_WINDOW_HEIGHT = 720;


}
