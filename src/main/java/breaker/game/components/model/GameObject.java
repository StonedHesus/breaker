// The package in which the current Java compilation unit is to be found.
package breaker.game.components.model;
// Imports from existing Java libraries, classes and interfaces.
import javafx.scene.layout.Pane;
// Import from custom libraries, classes and interfaces.

/**
 * @author Andrei-Paul Ionescu
 */
public abstract class GameObject {

    // Static values/constants of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    public abstract void draw(Pane target);

    public abstract void update(double deltaTime);

    // Public static methods of the unit.

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
