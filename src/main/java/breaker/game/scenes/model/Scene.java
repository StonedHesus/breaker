// The package in which the current Java compilation unit is to be found.
package breaker.game.scenes.model;
// Imports from existing Java libraries, classes and interfaces.
import javafx.beans.NamedArg;
import javafx.scene.Parent;
// Import from custom libraries, classes and interfaces.

/**
 * @author Andrei-Paul Ionescu
 */
public abstract class Scene extends javafx.scene.Scene{

    // Static values/constants of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.
    public Scene(@NamedArg("root") Parent root, @NamedArg("width") double width, @NamedArg("height")double height) {super(root, width, height);}

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    public abstract void tick();
    // Public static methods of the unit.

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
