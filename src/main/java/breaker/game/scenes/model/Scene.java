// The package in which the current Java compilation unit is to be found.
package breaker.game.scenes.model;
// Imports from existing Java libraries, classes and interfaces.
import javafx.beans.NamedArg;
import javafx.scene.Parent;
// Import from custom libraries, classes and interfaces.

/**
 * <p>
 *     This here compilation unit contains a class construct which provides the software with an
 *     abstract model of a scene.
 * </p>
 * <p>
 *     This model ought to facilitate interactions between the different scene components of the game
 *     for it provides a proto-class for their hierarchy.
 * </p>
 *
 * <p>
 *     Essentially this class can be perceived as a wrapper for JavaFX's Scene class.
 * </p>
 *
 * <p>
 *     The major difference betwixt this project's Scene type and the one provided by JavaFX is that
 *     our model contains a tick method, which will be overridden by each child of the class, so as
 *     to easily indicate the sequence of instructions which ought to be performed after each passing
 *     frame.
 * </p>
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
