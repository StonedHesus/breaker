// The package in which the current Java compilation unit is to be found.
package breaker.game.components.brick.model;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import breaker.game.components.model.GameObject;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * @author Andrei-Paul Ionescu
 */
public class Brick extends GameObject {
    // Static values/constants of the class.
    // Fields/attributes of the class.
    private final Rectangle graphics;
    // Constructor(s) of the class.
    public Brick(Rectangle graphics) {
        this.graphics = graphics;
    }

    // Getters of the class.
    public Rectangle getGraphics() {return this.graphics;}

    // Setters of the class.

    // Public non-static methods of the unit.
    @Override
    public void draw(Pane target) {

    }

    @Override
    public void update(double deltaTime) {

    }
    // Public static methods of the unit.

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
